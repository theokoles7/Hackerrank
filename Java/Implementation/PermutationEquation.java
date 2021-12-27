package Implementation;

import java.util.*;

public class PermutationEquation {
  public static void main(String args[]){
    System.out.println(permutationEquation(Arrays.asList(5, 2, 1, 3, 4)));  // 4, 2, 5, 1, 3)
    System.out.println(permutationEquation(Arrays.asList(2, 3, 1)));  // 2, 3, 1
    System.out.println(permutationEquation(Arrays.asList(4, 3, 5, 1, 2)));  // 1, 3, 5, 4, 2
  }

  public static List<Integer> permutationEquation(List<Integer> p){
    List<Integer> res = new ArrayList<>();
    for(int x = 1; x <= p.size(); x++){
      res.add(p.indexOf(p.indexOf(x) + 1) + 1);
    }
    return res;
  }
}
