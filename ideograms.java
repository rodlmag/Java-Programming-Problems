/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.
*/

import java.util.*;

public class isogram {
    public static boolean  isIsogram(String str) {
      Set<Character> iso = new HashSet<>();
      boolean flag = false;
      
      for(int i = 0; i < str.length(); i++){
        iso.add(str.charAt(i));
      }
      
      if(iso.size() == str.length()){
        flag = true;
      }
      return flag;
    } 
}
