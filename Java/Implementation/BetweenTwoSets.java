package Implementation;

import java.util.*;

public class BetweenTwoSets {
  public static void main(String args[]){
    //System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    System.out.println(getTotalX(Arrays.asList(2), Arrays.asList(20, 30, 12)));
  }

  public static int getTotalX(List<Integer> a, List<Integer> b){
    Collections.sort(a);Collections.sort(b);
    int target = a.get(a.size() - 1), count = 0;
    boolean div_a, div_b;
    while(target <= b.get(0)){
      div_a = true; div_b = true;
      for(int i = 0; i < a.size(); i++){
        if(target % a.get(i) != 0){
          div_a = false;
          break;
        }
      }
      for(int i = 0; i < b.size(); i++){
        if(b.get(i) % target != 0){
          div_b = false;
          break;
        }
      }
      if(div_a && div_b){count++;}
      target++;
    }
    return count;
  }
}
