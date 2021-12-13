import java.util.*;

public class PlusMinus {
  public static void main(String args[]){
    List<Integer> l = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));

    plusMinus(l);
  }

  public static void plusMinus(List<Integer> arr){
    int lt = 0, gt = 0, zero = 0;
    for(int i = 0; i < arr.size(); i++){
      if(arr.get(i) > 0){gt++;}
      else if(arr.get(i) < 0){lt++;}
      else{zero++;}
    }
    System.out.printf("\n%-7.6f \n%-7.6f \n%-7.6f \n", 
    gt * 1.0 / arr.size(), 
    lt * 1.0 / arr.size(), 
    zero * 1.0 / arr.size());
  }
}
