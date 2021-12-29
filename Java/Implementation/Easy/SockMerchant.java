package Implementation.Easy;

import java.util.*;

public class SockMerchant {
  public static void main(String args[]){
    System.out.println(sockMerchant(7, Arrays.asList(1, 2, 1, 2, 1, 3, 2)));
  }

  public static int sockMerchant(int n, List<Integer> ar){
    int count = 0;
    int[] pairs = new int[100];
    for(int i : ar){
      pairs[i - 1]++;
      if(pairs[i - 1] == 2){
        count++;
        pairs[i - 1] = 0;
      }
    }
    return count;
  }
}
