package Implementation;

import java.util.*;

public class Birthday {
  public static void main(String args[]){
    System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));     // 2
    System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));  // 0
    System.out.println(birthday(Arrays.asList(4), 4, 1));                 // 1
  }
  
  public static int birthday(List<Integer> s, int d, int m){
    int count = 0;
    for(int i = 0; i < s.size(); i++){
      int sum = s.get(i), l = 1, j = i + 1;
      while(sum < d && l < m && j < s.size()){
        sum += s.get(j++);
        l++;
      }
      if(sum == d && l == m){count++;}
    }
    return count;
  }
}
