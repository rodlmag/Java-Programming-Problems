/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
*/

import java.util.*;

public class FindOdd {
	public static int findIt(int[] a) {
    int odd = 0;
    
    //Unique values HashSet
    Set<Integer> difVal = new HashSet<>();
    for(int i = 0; i < a.length; i++){
      difVal.add(a[i]);
    }
    
    //HashSet to Array
    Integer arr[] = new Integer [difVal.size()]; 
    difVal.toArray(arr);
    
    //Iteration
    for(int j = 0; j < arr.length; j++){
      int current = arr[j];
      int count = 0;
      
      for(int k = 0; k < a.length; k++){
        if(current == a[k]){
          count++;
        }
      }
      if(count % 2 != 0){
        odd = current;
      }
    }
    
    return odd;
  }
}
