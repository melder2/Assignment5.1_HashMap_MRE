import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Dictionary{
	private HashMap<Integer, String> myMap;
	
	public Dictionary() {
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	}//end constructor
	
	public HashMap<Integer, String> loadDictionary(File xfile) throws NumberFormatException, IOException {

		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
			xfile = new File("C:\\Users\\mokel\\Downloads\\DictionaryWordValuePairs.txt");
			BufferedReader br = null;
			br = new BufferedReader(new FileReader(xfile));
			String line = null;
	
			while ((line = br.readLine()) != null) 
			{ 
			String []array = line.split(":");
			Integer key = Integer.parseInt(array[0].trim());//get the key 
			String value = array[1].trim();//get the value
			if(!key.equals("") && !value.equals(""))
				myMap.put(key, value);
			}
			br.close();
		return myMap;	
		
	}//end loadDictionary
	
	public void searchDictionary(String search) {
		search.hashCode();
		myMap.get(search);
		
	}//end searchDirectory
	
	public void printDictionary() {
		for(Entry<Integer, String> entry : myMap.entrySet())
			System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
	}//end printDictionary
	
}//end class
