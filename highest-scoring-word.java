/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
*/

public class Kata {

  public static String high(String s) {
    //Get and array of words found in the string
    String [] words = s.split(" ");
    String output = "";
    int highest = 0;
    
    if(words.length == 0){
      return "";
    } else {
      
      //Iterating over the words array
      for(int i = 0; i < words.length; i++){
        String w = words[i];
        int sum = 0;
        
        //Iterating over every word and adding each char value
        for(int j = 0; j < w.length(); j++){
          sum += Integer.valueOf(w.charAt(j) - 96);
        }
        
        //Comparing the value obtained to get the desired value
        if(sum > highest){
          highest = sum;
          output = w;
        }
      }
    }
    return output;
  }
}
