package Implementation.Easy;
import java.util.*;

public class CountApplesAndOranges {
  public static void main(String args[]){
    countApplesAndOranges(7, 11, 5, 15, Arrays.asList(-2, 2, 1), Arrays.asList(5, -6));
    System.out.println();
    countApplesAndOranges(2, 3, 1, 5, Arrays.asList(2), Arrays.asList(-2));
  }  

  public static void countApplesAndOranges(int l, int r, int a, int o, List<Integer> apples, List<Integer> oranges){
    int count_a = 0, count_o = 0;
    for(int i = 0; i < apples.size(); i++){
      if(a + apples.get(i) >= l && a + apples.get(i) <= r){count_a++;}
    }
    for(int i = 0; i < oranges.size(); i++){
      if(o + oranges.get(i) >= l && o + oranges.get(i) <= r){count_o++;}
    }
    System.out.print(count_a + "\n" + count_o);
  }
}
