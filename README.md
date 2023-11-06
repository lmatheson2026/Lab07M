# Lab07M
Project Manager - Lucas
Nathanial, Dean, Herve
Subtask #1 - Lucas

Create the class myFileReader that implements the
IFileReader interface. You will implement the readFileToTreeMap method. This method takes in
the file path to the CSV file and reads it to TreeMap with the first column (country name) as the
key and the remaining columns as the value. The value is a TreeSet.


Subtask #2 - Nathanial

Create class myFindCommon implementing the interface IFindCommon. There is
only one method, getCommonFood. In this method, the input is a TreeMap with the country’s name as the key, and the values shown as TreeSet holding the popular foods in that country.
The second input is a list of countries. The return value is the list of food that is popular among
all the (second) input countries. If there is no common food among all of them, the method
returns the food popular in the majority of countries.

Subtask #3 Herve

Create class myFoodPopularity implementing the interface IFoodPopularity. There is
only one method, getFoodPopularity. In this method, the input is a TreeMap with the country’s
name as the key, and the values shown as TreeSet holding the popular foods in that country.
There are two other inputs, each as a list of country names (countries1 and countries2). This
method will return the list of foods that are popular in majority of the countries in countries1
and not popular in the majority of the countries in countries2

Subtask #4 Dean

Create class mySimilarCountries implementing the interface ISimilarCountries. There
is only one method, getSimilarCountries. In this method, the input is a TreeMap with the
country’s name as the key, and the values shown as TreeSet holding the popular foods in that
country. The return value is a TreeMap that has a country name “A” as the key, and the value is
the list of country names that have the highest similarity with the country “A”.
