/*
Well met with Fibonacci bigger brother, AKA Tribonacci.
As the name may already reveal, it works basically like a Fibonacci, 
but summing the last 3 (instead of 2) numbers of the sequence to generate the next. 
*/

import java.util.*;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    n = 0;
    double [] triboSeq = new double [n];
    
    if(n == 0){
      
      return triboSeq;
      
    } else {
      
      List<Double> sequence = new ArrayList<>();
      for(double prevSeq: s){
        sequence.add(prevSeq);
      }
      
      for(int i = s.length - 1; i < n - 1; i++){
        double sum = sequence.get(i) + sequence.get(i - 1) + sequence.get(i - 2);
        sequence.add(sum);
      }
      
      for(int j = 0; j < sequence.size(); j++){
        triboSeq [j] = sequence.get(j);
      }
      return triboSeq;
    }
  }
}
