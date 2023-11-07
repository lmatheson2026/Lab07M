
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class myFileReader implements IFileReader {
    static TreeMap<String, TreeSet<String>> X = new TreeMap<String, TreeSet<String>>();

    /*
     * This method takes in a file and returns a treemap that contains all the 
     * sorted data, sorted by country(the key of the treemap)
     * 
     * @param file the file that will be read from
     * @return X returns the treemap that will be used in other methods
     */
    public TreeMap<String, TreeSet<String>> readFileToTreeMap(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
            	/*
            	 * sorts out all the food items based on 
            	 * what type of food they are
            	 */
                String[] segments = line.split(",");
                String country = segments[0];
                String hamburger = segments[1];
                String hotdog = segments[2];
                String pizza = segments[3];
                String applepie = segments[4];
                String meatpie = segments[5];               
                String tofu = segments[6];
                String sushi = segments[7];

                X.put(country, new TreeSet<String>());
                X.get(country).add(hamburger + "," + hotdog + "," + pizza + "," + applepie + "," + meatpie + "," + tofu + "," + sushi);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return X;
    }
}