/*
Take 2 strings s1 and s2 including only letters from a to z. 
Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
*/

import java.util.*;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
      
      //TreeSet Creation
      TreeSet<Character> letters = new TreeSet<>();
      
      //Iteration over s1
      for(int i = 0; i < s1.length(); i++){
        letters.add(s1.charAt(i));
      }
      
      //Iteration over s1
      for(int j = 0; j < s2.length(); j++){
        letters.add(s2.charAt(j));
      }
      
      //Converting TreeSet to String
      String output = "";
      Iterator itr = letters.iterator();
      
      while(itr.hasNext()){
        output += String.valueOf(itr.next());
      }
      
      return output;
    }
}
