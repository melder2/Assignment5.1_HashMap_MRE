/**
 * @author Michael Elder
 * Assignment 5.1 HashMap
 * Dictionary class creates the load dictionary method, search dictionary method, and print dictionary method
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class Dictionary{
	private HashMap<Integer, String> myMap;
	
	/**
	 * Constructor creates a new HashMap
	 */
	public Dictionary() {
		myMap = new HashMap<Integer, String>();
	}//end constructor
	
	/**
	 * Load dictionary method takes a file as a parameter and loads the file into the system. The method reads the
	 * file while there are lines in the document and puts it into an array and then hashes the key. 
	 * 
	 * @param xfile
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void loadDictionary(File xfile) throws NumberFormatException, IOException{

			BufferedReader br = null;//creates a buffered reader
			br = new BufferedReader(new FileReader(xfile));//buffered reader loads in the document which is the parameter
			String line = br.readLine();//creating a string variable line that refers to the line that is read by the file
	
			while (line != null) 
			{ 
			String[] array = line.split("\t");//splits the array with a tab
			String key = array[0];//get the key
			String value = array[1];//get the value
				myMap.put(key.hashCode(), value);//puts the hashcode created by the key and the value into an array
			line = br.readLine();//reads the next line
			}
			br.close();//closes the file reader
		
		
	}//end loadDictionary
	
	/**
	 * Search dictionary method returns the value of the search hashcode.
	 */
	public String searchDictionary(String search) {
		return myMap.get(search.hashCode());
		
	}//end searchDirectory
	
	/**
	 * Print dictionary prints the HashMap by iterating through all the lines.
	 */
	public void printDictionary() {
		for(Entry<Integer, String> entry : myMap.entrySet())
			System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
	}//end printDictionary
	
}//end class
