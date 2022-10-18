/*
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. 
*/

public class DnaStrand {
  public static String makeComplement(String dna) {
    //Your code
    String complement = "";
    
    for(int i = 0; i < dna.length(); i++){
      
      if(dna.charAt(i) == 'A'){
        complement += "T";
      } else if(dna.charAt(i) == 'C'){
        complement += "G";
      } else if(dna.charAt(i) == 'T'){
        complement += "A";
      } else {
        complement += "C";
      }
    }
    
    return complement;
  }
}
