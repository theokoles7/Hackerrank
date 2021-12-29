package Implementation.Easy;

import java.util.*;

public class CutTheSticks {
  public static void main(String args[]){
    System.out.println(cutTheSticks(new ArrayList<>(Arrays.asList(5, 4, 4, 2, 2, 8)))); // 6, 4, 2, 1
    System.out.println(cutTheSticks(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 3, 2, 1)))); // 8, 6, 4, 1
  }

  public static List<Integer> cutTheSticks(List<Integer> arr){
    int i = 0;
    List<Integer> cuts = new ArrayList<>();
    while(arr.size() > 0){
      cuts.add(0);
      int min = arr.get(0);
      for(int stick : arr){min = Math.min(min, stick);}
      for(int j = 0; j < arr.size(); j++){
        arr.set(j, arr.get(j) - min);
        cuts.set(i, cuts.get(i) + 1);
        if(arr.get(j) <= 0){arr.remove(j--);}
      }
      i++;
    }
    return cuts;
  }
}
