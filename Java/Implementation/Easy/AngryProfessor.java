package Implementation.Easy;

import java.util.*;

public class AngryProfessor {
  public static void main(String args[]){
    System.out.println(angryProfessor(3, Arrays.asList(-2, -1, 0, 1, 2)));  // YES
    System.out.println(angryProfessor(3, Arrays.asList(-1, -3, 4, 2)));     // YES
    System.out.println(angryProfessor(2, Arrays.asList(0, -1, 2, 1)));      // NO
  }

  public static String angryProfessor(int k, List<Integer> a){
    int count = 0;
    for(int student : a){
      if(student <= 0){
        count++;
        if(count >= k){
          return "NO";
        }
      }
    }
    return "YES";
  }
}
