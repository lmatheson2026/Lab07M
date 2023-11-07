package Lab7;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;


public class myFoodPopularity implements IFoodPopularity {
	
	// This method will return the list of foods that are popular in majority of the countries in countries1 
    // and not popular in the majority of the countries in countries2
	
    @Override
    public List<String> getFoodPopularity(TreeMap<String, TreeSet<String>> countryFoodSet, List<String> countries1, List<String> countries2) {
        // Create a set to store the foods that are popular in majority of the countries in countries1.
        Set<String> popularFoodsInCountries1 = new TreeSet<>();

        // Iterate over the countries in countries1 and add the foods in each country to the set.
        for (String country : countries1) {
            TreeSet<String> foodsInCountry = countryFoodSet.get(country);
            popularFoodsInCountries1.addAll(foodsInCountry);
        }

        // Create a set to store the foods that are popular in majority of the countries in countries2.
        Set<String> popularFoodsInCountries2 = new TreeSet<>();

        // Iterate over the countries in countries2 and add the foods in each country to the set.
        for (String country : countries2) {
            TreeSet<String> foodsInCountry = countryFoodSet.get(country);
            popularFoodsInCountries2.addAll(foodsInCountry);
        }

        // Create a list to store the foods that are popular in majority of the countries in countries1
        // and not popular in the majority of the countries in countries2.
        List<String> popularFoods = new ArrayList<>();

        // Iterate over the foods that are popular in countries1.
        for (String food : popularFoodsInCountries1) {
            if (!popularFoodsInCountries2.contains(food)) {
                popularFoods.add(food);
            }
        }

        // Return the list of popular foods.
        return popularFoods;
    }
}
