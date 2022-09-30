package Maven.Maven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
  
public class HashMap<K, V> 
{
	private HashMap<String, String> myMap;
	
	public HashMap(){
		myMap = new HashMap<String, String>();
	}//end constructor
	public static void main(String[]args) {
   
    	/**
    	 * This uploads the path to the excel worksheet with the dictionary word values
    	 */
        FileInputStream file = new FileInputStream(
            "\"C:\\Users\\mokel\\Downloads\\DictionaryWordValuePairs.xlsx\"");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet s = workbook.getSheet("Sheet1");
        
        /**
         * This for loop places the key(the word) and the values(definitions) into the HashMap
         */
        HashMap<String, String> myMap= new HashMap<String, String>();
  
        for (int c = 0; c <= s.getLastRowNum(); c++) 
        {
            String key = s.getRow(c)
                          .getCell(0)
                          .getStringCellValue();
            String value = s.getRow(c)
                               .getCell(1)
                               .getStringCellValue();
            myMap.put(key, value);
        }//end forLoop
  
        /**
         * This while loop iterates through the HashMap and displays the dictionary of the archaic words
         * with their definitions.
         */
        Iterator<Entry<String, String> > iterator= map.entrySet().iterator();
  
        while (iterator.hasNext()) 
        {
            Map.Entry<String, String> myMap = (Map.Entry<String, String>)
            		iterator.next();
  
            System.out.println(myMap.getKey() + "|"+ myMap.getValue());
        }//end while loop
        
        workbook.close();
        file.close();
    
    }//end main

}//end class