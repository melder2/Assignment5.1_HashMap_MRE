/**
 * @author Michael Elder
 * Assignment 5.1 HashMap
 * Driver class loads a file into the loadDictionary method. It then searches the dictionary for 5 words and then
 * printDictionary prints out the entire dictionary with the hashcode and the value which is the definition.
 */
import java.io.*;
  
class Driver {
    
	public static void main(String[] args) throws NumberFormatException, IOException
    {
		
		File xfile = new File("C:\\Users\\mokel\\Downloads\\DictionaryWordValuePairs.txt");
		Dictionary myMap = new Dictionary();
		myMap.loadDictionary(xfile);
		System.out.println("appetency");
		System.out.println(myMap.searchDictionary("appetency"));
		System.out.println("appetency".hashCode());
		System.out.println("mooncalf");
		System.out.println(myMap.searchDictionary("mooncalf"));
		System.out.println("mooncalf".hashCode());
		System.out.println("damsel");
		System.out.println(myMap.searchDictionary("damsel"));
		System.out.println("damsel".hashCode());
		System.out.println("egad");
		System.out.println(myMap.searchDictionary("egad"));
		System.out.println("egad".hashCode());
		System.out.println("repulsive");
		System.out.println(myMap.searchDictionary("repulsive"));
		System.out.println("repulsive".hashCode());
		myMap.printDictionary();
    }//end main
    
}//end class
