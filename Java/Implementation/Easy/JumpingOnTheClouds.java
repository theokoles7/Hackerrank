package Implementation.Easy;

import java.util.*;

public class JumpingOnTheClouds {
  public static void main(String args[]){
    System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));  // 4
    System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 1, 0)));     // 3
    System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0)));     // 3
  }

  public static int jumpingOnClouds(List<Integer> c){
    int i = 0, jumps = 0;
    while(i < c.size() - 1){
      if(i < c.size() - 2 && c.get(i + 2) != 1){i++;}
      i++;
      jumps++;
    }
    return jumps;
  }
}
