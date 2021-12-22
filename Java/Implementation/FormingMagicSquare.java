package Implementation;

import java.util.*;

public class FormingMagicSquare {
  public static void main(String args[]){
    System.out.println(formingMagicSquare(Arrays.asList(Arrays.asList(5, 3, 4), Arrays.asList(1, 5, 8), Arrays.asList(6, 4, 2)))); // 7
    System.out.println(formingMagicSquare(Arrays.asList(Arrays.asList(4, 9, 2), Arrays.asList(3, 5, 7), Arrays.asList(8, 1, 5)))); // 1
    System.out.println(formingMagicSquare(Arrays.asList(Arrays.asList(4, 8, 2), Arrays.asList(4, 5, 7), Arrays.asList(6, 1, 6)))); // 4
    System.out.println(formingMagicSquare(Arrays.asList(Arrays.asList(2, 9, 8), Arrays.asList(4, 2, 7), Arrays.asList(5, 6, 7)))); // 21
  }

  public static int formingMagicSquare(List<List<Integer>> s){
    int[][][] magicSquareCombinations = {
      { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
      { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
      { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
      { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
      { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
      { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
      { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
      { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
    };
    int minCost = Integer.MAX_VALUE;
    for (int i = 0; i < magicSquareCombinations.length; i++) {
      int modifyCost = 0;
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          modifyCost += Math.abs(s.get(j).get(k) - magicSquareCombinations[i][j][k]);
        }
      }
      minCost = Math.min(modifyCost, minCost);
    }
    return minCost;}
}
