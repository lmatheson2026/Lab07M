import java.util.*;

//import Lab7.IFindCommon;

public class myFindCommon implements IFindCommon{

	@Override
	public List<String> getCommonFood(TreeMap<String, TreeSet<String>> countryFoodSet, List<String> countries) {
		List<String> commonFoods = new ArrayList<>(); //AL for results

		//Count for food items
		TreeMap<String, Integer> foodCount = new TreeMap<>();
		int maxCount = 0;

		/*
		 * This loop iterates through the given List countries,
		 * it then uses the country names to find the TreeSet(TS)
		 * of foods pertaining to that country. Following that 
		 * it traverses the TS counting what how many times a food 
		 * is in the TS.
		 * */
		for(String country : countries) {
			TreeSet<String> foods = countryFoodSet.get(country);
			if (foods != null) {
				for(String food : foods ) {
					foodCount.put(food, foodCount.getOrDefault(food, 0) + 1);
					int count = foodCount.get(food);
					if (count > maxCount) {
						maxCount = count;
						commonFoods.clear();
						commonFoods.add(food);
					}
					else if(count == maxCount && !commonFoods.contains(food)) {
						commonFoods.add(food);
					}
				}//End for loop #2
			}
		}//End for loop #1


		//Backup - if no common food, finds the most popular food overall
		if (commonFoods.isEmpty()) {
			for (String food : foodCount.keySet()) {
				int count = foodCount.get(food);
				if (count >= maxCount) {
					if (count > maxCount) {
						maxCount = count;
						commonFoods.clear();
					}
					commonFoods.add(food);
				}
			}//end for loop #3
		}//end if 


		return commonFoods;
	}//End of getCommonFood

}//End of myFindCommon
