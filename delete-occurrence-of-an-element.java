/*
Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] 
since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
*/

import java.util.*;

public class EnoughIsEnough {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    List<Integer> eleList = new ArrayList<>();
    
    //Extracting the element and add it to the "eleList"
    for(int i = 0; i < elements.length; i++){
      eleList.add(elements[i]);
      int counter = 0;
      int size = eleList.size();
      
      //Iterating over the "eleList" and check that the current element do not repeat more than "maxOccurrences"
      for(int j = 0; j < size; j++){
        if(elements[i] == eleList.get(j) && counter < maxOccurrences){
          counter++;
        } else if (elements[i] == eleList.get(j) && counter == maxOccurrences){
          eleList.remove(j);
        }
      }
    }
    
    int [] output = new int [eleList.size()];
    for(int k = 0; k < output.length; k++){
      output[k] = eleList.get(k);
    }
    return output;
  }
}
