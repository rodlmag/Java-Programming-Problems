import java.util.List;

public class BinaryArrayToNumber {
  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    int conv = 0;
    int exp = 0;
    
    for(int i = binary.size() - 1; i >= 0 ; i--){
      conv += potNumber(2,exp) * binary.get(i);
      exp++;
    }
    return conv;
  }
  
  //Method to elevate a number to a desired exp
  public static int potNumber(int n, int exp){
    int x = n;
    
    if(exp == 0){
      return 1;
    } else {
      for(int i = 1; i < exp; i++){
      x = n * x;
    }
    return x;
    }
  } 
}
