import java.util.*;

public class SimpleArraySum {
    public static void main(String[] args){
      List<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
      List<Integer> a2 = new ArrayList<>(Arrays.asList(3, 5, 1));

      System.out.println(a1 + " = " + simpleArraySum(a1));
      System.out.println(a2 + " = " + simpleArraySum(a2));
    }

    public static int simpleArraySum(List<Integer> ar) {
      int sum = 0;
      for(int i = 0; i < ar.size(); i++){
        sum += ar.get(i);
      }
      return sum;

    }
}
