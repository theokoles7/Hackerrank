package Implementation.Easy;

import java.util.*;

public class EqualizeArray {
  public static void main(String args[]){
    System.out.println(equalizeArray(new ArrayList<>(Arrays.asList(1, 2, 2, 3))));    // 2
    System.out.println(equalizeArray(new ArrayList<>(Arrays.asList(3, 3, 2, 1, 3)))); // 2
    System.out.println(equalizeArray(new ArrayList<>(Arrays.asList(37, 32, 97, 35, 76, 62)))); // 5
  }

  public static int equalizeArray(List<Integer> arr){
    Collections.sort(arr);
    int count = 1, max = 1;
    for(int i = 1; i < arr.size(); i++){
      if(arr.get(i - 1) == arr.get(i)){
        count++;
        max = Math.max(max, count);
      }else{
        count = 1;
      }
    }
    return arr.size() - max;
  }
}
