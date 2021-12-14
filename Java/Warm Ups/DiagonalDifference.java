import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
  public static void main(String args[]){
    List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> l2 = new ArrayList<>(Arrays.asList(4, 5, 6));
    List<Integer> l3 = new ArrayList<>(Arrays.asList(9, 8, 9));
    List<List<Integer>> l = new ArrayList<>(Arrays.asList(l1, l2, l3));

    System.out.println(diagonalDifference(l));
  }

  public static int diagonalDifference(List<List<Integer>> l){
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0, j = l.size() - 1; i < l.size(); i++, j--){
      sum1 += l.get(i).get(i);
      sum2 += l.get(i).get(j);
    }
    return Math.max(sum1, sum2) - Math.min(sum1, sum2);
  }
}