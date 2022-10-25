/*
You are going to be given a word. Your job is to return the middle character of the word. 
If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
*/

import java.lang.Math;

class Kata {
  public static String getMiddle(String word) {
    int len = word.length();
    String middle = "";
    
    if(len % 2 == 0){
      middle = String.valueOf( word.charAt( (len/2)-1 ) ) + String.valueOf( word.charAt(len/2) );
    } else {
      middle = String.valueOf( word.charAt( Math.round(len/2) ) );
    }
    return middle;
  }
}
