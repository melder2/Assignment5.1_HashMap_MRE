
  
import java.io.*;
import java.util.*;
  
class Driver {
    
	public static void main(String[] args)
    {
		
		File xfile = new File("C:\\Users\\mokel\\Downloads\\DictionaryWordValuePairs.txt");
		myMap.loadDictionary(xfile);
		myMap.searchDictionary("carl");
		myMap.searchDictionary("gyve");
		myMap.searchDictionary("cicisbeo");
		myMap.searchDictionary("virtue");
		myMap.searchDictionary("plight");
		myMap.printDictionary();
		
    }//end main
    
}//end class
