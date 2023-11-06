
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class myFileReader implements IFileReader{
static String foods = "";
static TreeMap<String, TreeSet<String>> X = new TreeMap<String, TreeSet<String>>();

	public TreeMap<String, TreeSet<String>> readFileToTreeMap(String file) {
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		while (foods != null) {
			String[] segments = foods.split(",");
			String country = segments[0];
			String hamburger = segments[1];
			String hotdog = segments[2];
			String pizza = segments[3];
			String applepie = segments[4];
			String meatpie = segments[5];
			String tofu = segments[6];
			String sushi = segments[7];
			
			
			X.put(country, new TreeSet<String>());
		X.get(country).add(hamburger + " ," +hotdog +" ," + pizza + " ," +applepie +" ," + meatpie +" ," + tofu + " ," +  sushi);	
		}
		return (X);
	}
	
}
