/*
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical 
order of the strings of a1 which are substrings of strings of a2.

Example 1:

a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
*/

import java.util.*;
public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
    
    //Using TreeSet to avoid duplicated values and sort lexycographically
    TreeSet<String> subs = new TreeSet<>();
    
    //Iterating over the substrings array
    for(int i = 0; i < array1.length; i++){
      
      //Iterating over the words to check if they have the substring
      for(int j = 0; j < array2.length; j++){
        
        if(array2[j].contains(array1[i])){
          subs.add(array1[i]);
        }
      }
    }
    
    //Convert TreeSet into array
    String [] output = new String [subs.size()];
    Iterator<String> itr = subs.iterator();
    int k = 0;
    
    while(itr.hasNext()){
      output[k] = itr.next();
      k++;
    }
    return output;
	}
}
