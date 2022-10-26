/*
Implement a function that adds two numbers together and returns their sum in binary.
The conversion can be done before, or after the addition.
The binary number returned should be a string.
*/

import java.lang.Math;

public class Kata{
  
  public static String binaryAddition(int a, int b){
    //your code here
    String invertedBinary = "";
    String binary = "";
    int res = 0;
    int sum = a + b;
    
    //Coverting decimal to binary
    while(sum != 0){
      res = Math.round(sum%2);
      invertedBinary += String.valueOf(res);
      sum = sum/2;
    }
    
    //Reversing the obtained string to math the correct order
    for(int i = invertedBinary.length() - 1; i >= 0; i--){
      binary += String.valueOf(invertedBinary.charAt(i));
    }
    return invertedBinary;
  }
}
