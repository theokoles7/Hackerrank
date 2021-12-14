import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
  public static void main(String args[]){
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> b = new ArrayList<>(Arrays.asList(3, 2, 1));

    System.out.println(compareTriplets(a, b));
  }

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
    List<Integer> res = new ArrayList<>(Arrays.asList(0, 0));
    for(int i = 0; i <= 2; i++){
      if(a.get(i) > b.get(i)){
        res.set(0, res.get(0) + 1);
      }else if(a.get(i) < b.get(i)){
        res.set(1, res.get(1) + 1);
      }
    }
    return res;
  }
}
