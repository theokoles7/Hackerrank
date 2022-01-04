package Implementation.Easy;

import java.util.*;

public class BeautifulTriplets {
  public static void main(String args[]){
    System.out.println(beautifulTriplets(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10)));  // 3
    System.out.println(beautifulTriplets(3, Arrays.asList(1, 6, 7, 7, 8, 10, 12, 13, 14, 19)));  // 2
  }

  public static int beautifulTriplets(int d, List<Integer> arr){
    int count = 0;
    for(int i = 0; i < arr.size() - 2; i++){
      for(int j = i + 1; j < arr.size() - 1; j++){
        if(arr.get(j) - arr.get(i) == d){
          for(int k = j + 1; k < arr.size(); k++){
            if(arr.get(k) - arr.get(j) == d){count++;}
          }
        }
      }
    }
    return count;
  }
}
