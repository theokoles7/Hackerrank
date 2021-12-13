import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {
  public static void main(String args[]){
    List<Long> array1 = new ArrayList<>(Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L));

    System.out.println(aVeryBisSum(array1));
  }

  public static long aVeryBisSum(List<Long> ar){
    long sum = 0;
    for(int i = 0; i < ar.size(); i++){
      sum += ar.get(i);
    }
    return sum;
  }
}
