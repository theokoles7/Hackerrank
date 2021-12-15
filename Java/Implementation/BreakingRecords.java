package Implementation;

import java.util.*;

public class BreakingRecords {
  public static void main(String args[]){
    System.out.println(breakingRecords(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1))); // 2 4
  }

  public static List<Integer> breakingRecords(List<Integer> scores){
    int min_v = scores.get(0), max_v = scores.get(0), min = 0, max = 0;
    for(int score : scores){
      if(score > max_v){max_v = score;max++;}
      if(score < min_v){min_v = score;min++;}
    }
    return Arrays.asList(max, min);
  }
}
