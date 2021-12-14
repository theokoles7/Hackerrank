import java.util.*;

public class MiniMaxSum {
  public static void main(String args[]){
    List<Integer> l = new ArrayList<>(Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279)); // 2093989309 2548418794
    miniMaxSum(l);
  }

  public static void miniMaxSum(List<Integer> arr){
    long min = (long)arr.get(0), max = (long)arr.get(0), sum = 0L;
    for(int i = 0; i < arr.size(); i++){
      if(arr.get(i) > max){max = arr.get(i);}
      if(arr.get(i) < min){min = arr.get(i);}
      sum += arr.get(i);
    }
    System.out.print((sum - max) + " " + (sum - min));
  }
}
