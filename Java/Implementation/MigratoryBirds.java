package Implementation;

import java.util.*;

public class MigratoryBirds {
  public static void main(String args[]){
    System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
    System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
  }

  public static int migratoryBirds(List<Integer> arr){
    int[] count = {0, 0, 0, 0, 0};
    for(int i = 0; i < arr.size(); i++){
      count[arr.get(i) - 1] += 1; 
    }
    int max = 0, max_v = 0;
    for(int i = 0; i < count.length; i++){
      if(count[i] > max_v){
        max_v = count[i];
        max = i + 1;
      }
    }
    return max;
  }
}
