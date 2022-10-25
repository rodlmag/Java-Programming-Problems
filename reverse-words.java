/*
Complete the function that accepts a string parameter, and reverses each word in the string.
All spaces in the string should be retained.
*/

public class Kata {
  public static String reverseWords(final String original) {
    String revStr = "";
    String finalStr = "";
    String [] arrStr = original.split(" ");
    
    if(original.matches("[ ]{3,}")){
      return original;
      
    } else {
      for(int i = 0; i < arrStr.length; i++){
        String currStr = arrStr[i];
        
        for(int j = currStr.length() - 1; j >= 0; j--){
          revStr += String.valueOf(currStr.charAt(j));
          
        }
        if(i < arrStr.length - 1){
          finalStr += revStr + " ";
          
        } else {
          finalStr += revStr;
          
        }
        revStr = "";
      }
      return finalStr;
    }
  }
}
