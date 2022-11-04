/*
Our team's match results are recorded in a collection of strings. Each match is represented by a string in the format "x:y", 
where x is our team's score and y is our opponents score.
For example: ["3:1", "2:2", "0:1", ...]
Points are awarded for each match as follows:

if x > y: 3 points (win)
if x < y: 0 points (loss)
if x = y: 1 point (tie)
We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.
*/
public class TotalPoints {
  
    public static int points(String[] games) {
      int ans = 0;
      for(int i = 0; i  < 10; i++){
        String r [] = games[i].split(":");
        
        if(Integer.parseInt(r[0]) > Integer.parseInt(r[1])){
          ans += 3;
        } else if(Integer.parseInt(r[0]) == Integer.parseInt(r[1])) {
          ans += 1;
        } else {
          continue;
        }
      }
      return ans;
    }
}
