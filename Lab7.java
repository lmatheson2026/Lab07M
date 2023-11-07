import java.util.List;

public class Lab7 {

	public static void main(String[] args) {
		myFileReader A = new myFileReader();
		myFoodPopularity B = new myFoodPopularity();
		myFoodPopularity C = new myFoodPopularity();
		mySimilarCountries D = new mySimilarCountries();
		
		 List<String> countries1 = List.of("Japan", "Iran");
	        List<String> countries2 = List.of("Crotia", "Canada");
	        System.out.println(A.readFileToTreeMap("Foods.csv"));
		B.getFoodPopularity(A.readFileToTreeMap("Foods.csv"),countries1, countries2);
		C.getFoodPopularity(A.readFileToTreeMap("Foods.csv"),countries1,countries2);
		D.getSimilarCountries(A.readFileToTreeMap("Foods.csv"));
	}

}