/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
*/

public class SquareDigit {

  public int squareDigits(int n) {
    String original = Integer.toString(n);
    String squared  = "";
    
    for(int i = 0; i < original.length(); i++){
      int d = Integer.parseInt(String.valueOf(original.charAt(i)));
      int j = 0;
      d *= d;
      squared += Integer.toString(d);
    }
    int ans = Integer.parseInt(squared);
    return ans;
  }
}
