package collections;
import java.util.HashMap;
 
public class CharOccurences
{
    private static void characterCount(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
  
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
  
        //Converting given string to char array
  
        char[] charArray = inputString.toCharArray();
  
        //checking each char of strArray
  
        for (char c : charArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
  System.out.println(charCountMap);
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
  
                charCountMap.put(c, 1);
            }
        }
         
        //Printing inputString and charCountMap 
  
        System.out.println(inputString+" : "+charCountMap);
    }
  
    public static void main(String[] args)
    {
       characterCount("aabbBBcc");
  
       /*characterCount("All Is Well");
  
       characterCount("Done And Gone");*/
    }
}