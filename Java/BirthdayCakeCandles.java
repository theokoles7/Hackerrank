import java.util.*;

public class BirthdayCakeCandles {
  public static void main(String args[]){
    List<Integer> candles = new ArrayList<>(Arrays.asList(4, 4, 1, 3, 5, 5, 5));
    System.out.println(birthdayCakeCandles(candles));
  }

  public static int birthdayCakeCandles(List<Integer> candles){
    int max = candles.get(0), count = 1;
    for(int i = 1; i < candles.size(); i++){
      if(candles.get(i) == max){count++;}
      else if(candles.get(i) > max){
        max = candles.get(i);
        count = 1;
      }
    }
    return count;
  }
}
