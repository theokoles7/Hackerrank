package Implementation;

import java.util.*;

public class CircularArrayRotation {
  public static void main(String args[]){
    System.out.println(circularArrayRotation(new ArrayList<>(Arrays.asList(3, 4, 5)), 2, new ArrayList<>(Arrays.asList(1, 2))));
    System.out.println(circularArrayRotation(new ArrayList<>(Arrays.asList(1, 2, 3)), 2, new ArrayList<>(Arrays.asList(0, 1, 2))));
  }

  public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries){
    for(int i = 0; i < k; i++){
      a.add(0, a.remove(a.size() - 1));
    }
    for(int n = 0; n < queries.size(); n++){
      queries.set(n, a.get(queries.get(n)));
    }
    return queries;
  }
}
