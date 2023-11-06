import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class mySimilarCountries implements ISimilarCountries {

    /***
     * 
     * @author dean casbay
     * 
     * Subtask #4
     * Create class mySimilarCountries implementing the interface ISimilarCountries. There is only one method, getSimilarCountries. 
     * In this method, the input is a TreeMap with the country’s name as the key, and the values shown as TreeSet holding the popular foods in that country. 
     * The return value is a TreeMap that has a country name “A” as the key, and the value is the list of country names that have the highest similarity with the country “A”.
     * 
     */

    public TreeMap<String, List<String>> getSimilarCountries(TreeMap<String, TreeSet<String>> countryFoodSet) {
        TreeMap<String, List<String>> countriesMap = new TreeMap<>();

        for (String countryA : countryFoodSet.keySet()) {
            List<String> similarCountries = new ArrayList<>();

            for (String countryB : countryFoodSet.keySet()) {
                if (!countryA.equals(countryB)) {
                    TreeSet<String> foodA = countryFoodSet.get(countryA);
                    TreeSet<String> foodB = countryFoodSet.get(countryB);
                    foodA.retainAll(foodB);

                    if (foodA.size() >= 2) {
                        similarCountries.add(countryB);
                    }
                }
            }
            countriesMap.put(countryA, similarCountries);
        }
        return countriesMap;
    }
}