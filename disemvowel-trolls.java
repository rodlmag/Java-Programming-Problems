/*
Your task is to write a function that takes a string and return a new string with all vowels removed.
*/

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
      String output = "";

      for(int i = 0; i < str.length(); i++){
        if(!String.valueOf(str.charAt(i)).matches("[aeiouAEIOU]")){
          output += String.valueOf(str.charAt(i));
        }
      }
      return output;
    }
}
