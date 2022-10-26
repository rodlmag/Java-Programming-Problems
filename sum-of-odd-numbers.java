/*
Given the triangle of consecutive odd numbers:
             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle.
*/

import java.util.*;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
      int sum = 0;
      List<Integer> odds = new ArrayList<>();
      int maxNum = n * (n + 1);
      
      //Getting the odds list till the desired row
      for(int i = 1 ; i < maxNum; i++){
        if(i % 2 != 0){
          odds.add(i);
        }
      }
      
      //Filtering the data to obtain only the values of the desired row
      for(int j = 0; j < n; j++){
        sum += odds.get(odds.size() -1 -j);
      }
      return sum;
    }
}
