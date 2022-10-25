/*
In this kata you will create a function that takes a list of non-negative integers 
and strings and returns a new list with the strings filtered out.
*/

import java.util.*;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    List<Object> filtered = new ArrayList<>();
    
    for(int i = 0; i < list.size(); i++){
      if(list.get(i).getClass() == Integer.class){
        filtered.add(list.get(i));
      }
    }
    return filtered;
  }
}
