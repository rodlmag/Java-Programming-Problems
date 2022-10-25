/*
Complete the function that accepts a string parameter, and reverses each word in the string.
All spaces in the string should be retained.
*/

public class Kata {
  public static String reverseWords(final String original) {
    String revStr = "";
    String finalStr = "";
    String [] arrStr = original.split(" ");
    
    //Getting every String from the original
    for(int i = 0; i < arrStr.length; i++){
      String currStr = arrStr[i];
      
      //Traversing the string backwards
      for(int j = currStr.length() - 1; j >= 0; j--){
        revStr += String.valueOf(currStr.charAt(j));
      }
      
      //Retaining the original spaces on the string
      if(i < arrStr.length - 1){
        finalStr += revStr + " ";
      } else {
        finalStr += revStr;
      }
      
      //Cleaning the variable
      revStr = "";
    }
    return finalStr;
  }
}
