package Implementation;

import java.util.*;

public class DivisibleSumPairs {
  public static void main(String args[]){
    System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
  }

  public static int divisibleSumPairs(int n, int k, List<Integer> ar){
    int pairs = 0;
    for(int i = 0; i < ar.size() - 1; i++){
      for(int j = i + 1; j < ar.size(); j++){
        if((ar.get(i) + ar.get(j)) % k == 0){pairs++;}
      }
    }
    return pairs;
  }
}
