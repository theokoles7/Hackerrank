package Implementation.Easy;

import java.util.*;

public class HurdleRace {
  public static void main(String args[]){
    System.out.println(hurdleRace(4, Arrays.asList(1, 6, 3, 5, 2)));
    System.out.println(hurdleRace(7, Arrays.asList(2, 5, 4, 5, 2)));
  }

  public static int hurdleRace(int k, List<Integer> height){
    int max = 0;
    for(int h : height){
      if(h > k){
        max = Math.max(max, h - k);
      }
    }
    return max;
  }
}
