import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary{
	private HashMap<String, String> myMap;
	
	public Dictionary() {
		HashMap<String, String> myMap = new HashMap<String, String>();
	}//end constructor
	
	public void loadDictionary(String key, String value) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in); 
		File file = new File("C:\\Users\\mokel\\Downloads\\DictionaryWordValuePairs.txt"); 
		scan = new Scanner(file);
		Dictionary myMap = new Dictionary(); 
		
		while (scan.hasNextLine()) 
		{ 
		key = scan.nextLine();//get the key 
		value = scan.nextLine();//get the value
		}//end while loop
		System.out.printf(key, value);
	}//end loadDictionary
	
	public void searchDictionary(String search, String value) {
		for(int c = 0; c < 436; c++) {
			myMap.get(search);
		if(search == null) {
			return;
		}
		}//end for loop
	}//end searchDirectory
	
	public void printDictionary() {
		return myMap<String, String>();
	}//end printDictionary
	
}//end class
