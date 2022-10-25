/*
Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle
*/

public class Kata {
  public static String findNeedle(Object[] haystack) {
    // Your code here
    String ans = "";
    int val = 0;
    
    for(int i = 0; i < haystack.length; i++){
      String curr = String.valueOf(haystack[i]);
      
      if(curr.contains("needle")){
        val = i;
        break;
      }
    }
    ans = "found the needle at position " + String.valueOf(val);
    return ans;
  }
}
