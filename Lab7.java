package testing;

public class Lab7 {

	public static void main(String[] args) {
		myFileReader A = new myFileReader();
		myFoodPopularity B = new myFoodPopularity();
		myFoodPopularity C = new myFoodPopularity();
		mySimilarCountries D = new mySimilarCounries();

		B.getFoodPopularity(A.readFileToTreeMap(Foods.csv));
		C.getFoodPopularity(A.readFileToTreeMap(Foods.csv));
		D.getSimilarCountries(A.readFileToTreeMap(Foods.csv));
	}

}
