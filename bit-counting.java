/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in 
the binary representation of that number. You can guarantee that input is non-negative.
*/

import java.lang.Math;
public class BitCounting {

	public static int countBits(int n){
    
    int actualNum = n;
    String binNum = "";
    int counter = 0;
    
    /*Converting the number to binary **It will convert but in reverse way | Intead of -> 10011 it will return ->11001 
    but for this exercise we only care about 1's */
    while(actualNum > 0){
      int res = actualNum % 2;
      actualNum = actualNum / 2;
      binNum += String.valueOf(Math.round(res));
    }
    
    for(int i = 0; i < binNum.length(); i++){
      if(binNum.charAt(i) == '1'){
        counter++;
      }
    }
    
    return counter;
	}
	
}
