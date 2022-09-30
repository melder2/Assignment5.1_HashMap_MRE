
  
import java.io.*;
import java.util.*;
  
class Driver {
    
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in); 
		File file = new File("C:\\Users\\mokel\\Downloads\\DictionaryWordValuePairs.txt"); 
		scan = new Scanner(file); 
		Dictionary myMap = new Dictionary(); 
		myMap.loadDictionary();
		myMap.searchDictionary("carl", "a man of low birth");
		myMap.searchDictionary("gyve", "a fetter or shackle");
		myMap.searchDictionary("cicisbeo", "a married woman's male companion or lover");
		myMap.searchDictionary("virtue", "virginity");
		myMap.searchDictionary("plight", "solemnly pledge of promise (faith or loyalty)");
		myMap.printDictionary();
		
    }//end main
    
}//end class
