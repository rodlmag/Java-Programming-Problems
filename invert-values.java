/*
Given a set of numbers, return the additive inverse of each.
Each positive becomes negatives, and the negatives become positives.
*/

/* OPTION 1 */

public class Kata {
  public static int[] invert(int[] array) {
    int [] inverted = new int [array.length];
    int i = 0;
    
    for(int n: array){
        inverted[i] = n * -1;
        i++;
      }
    return inverted;
  }
}


/* OPTION 2 */
import java.lang.Math;

public class Kata {
  public static int[] invert(int[] array) {
    int [] inverted = new int [array.length];
    int temp = 0;
    int i = 0;
    for(int n: array){
      
      if(n > 0){
        temp = n;
        inverted[i] = n - (temp * 2);
        i++;
      } else {
        temp = Math.abs(n);
        inverted[i] = n + (temp * 2);
        i++;
      }
    }
    return inverted;
  }
}
