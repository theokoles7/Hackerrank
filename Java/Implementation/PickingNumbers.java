package Implementation;

import java.util.*;

public class PickingNumbers {
  public static void main(String args[]){
    System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));  // 3
    System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));  // 5
  }

  public static int pickingNumbers(List<Integer> a){
    List<List<Integer>> tab = new ArrayList<>();
    int max = 0;
    for(int i : a){
      tab.add(new ArrayList<>(Arrays.asList(i)));
    }
    for(List<Integer> l : tab){
      for(int i : a){
        boolean valid = true;
        for(int j : l){
          if(Math.max(j, i) - Math.min(j, i) > 1){
            valid = false;
            break;
          }
        }
        if(valid){l.add(i);}
        max = Math.max(max, l.size());}
    }
    return max - 1;
  }
}
