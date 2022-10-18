/*
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. 
We want to create the text that should be displayed next to such an item.
*/

class Solution {
    public static String whoLikesIt(String... names) {
      String text = "";
      
      if (names.length == 0){
        text = "no one likes this";
      } else if (names.length == 1){
        text = names[0] + " likes this";
      } else if (names.length == 2) {
        text = names[0] + " and " + names[1] + " like this";
      } else if (names.length == 3) {
        text = names[0] + ", " + names[1] + " and " + names[2] + " like this";
      } else if (names.length > 3) {
        int c = names.length - 2;
        text = names[0] + ", " + names[1] + " and " + c + " others like this";
      }
      
      return text;
    }
}
