
// Java program to reading
// text file to HashMap
  
import java.io.*;
import java.util.*;
  
class Driver {
    
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in); //reading from text file
		File file = new File("C:\\Users\\mokel\\Downloads\\DictionaryWordValuePairs.txt"); //i took this file for example. You can mention your file path here
		scan = new Scanner(file); //input will read file
		Dictionary myMap = new Dictionary(); //hashmap where data will store
		myMap.loadDictionary();
		myMap.searchDictionary("carl", "a man of low birth");
		myMap.searchDictionary("gyve", "a fetter or shackle");
		myMap.searchDictionary("cicisbeo", "a married woman's male companion or lover");
		myMap.searchDictionary("virtue", "virginity");
		myMap.searchDictionary("plight", "solemnly pledge of promise (faith or loyalty)");
		myMap.printDictionary();
		
    }//end main
    
}//end class
