package Implementation.Easy;

import java.util.*;

public class ClimbingLeaderboard {
  public static void main(String args[]){
    System.out.println(climbingLeaderboard(Arrays.asList(100, 100, 50, 40, 40, 20, 10), Arrays.asList(5, 5, 25, 50, 120)));  // 6, 4, 2, 1
    System.out.println(climbingLeaderboard(Arrays.asList(100, 90, 90, 80, 75, 60), Arrays.asList(50, 65, 77, 90, 102)));  // 6, 5, 4, 2, 1
  }

  static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    int n = ranked.size();
    int m = player.size();
  
    List<Integer> res = new ArrayList<>(m);
    int[] rank = new int[n];
  
    rank[0] = 1;
  
    for (int i = 1; i < n; i++) {
      if (ranked.get(i) == ranked.get(i - 1)) {
        rank[i] = rank[i - 1];
      } else {
        rank[i] = rank[i - 1] + 1;
      }
    }
  
    for (int i = 0; i < m; i++) {
      int playerScore = player.get(i);
      if (playerScore > ranked.get(0)) {
        res.add(i, 1);
      } else if (playerScore < ranked.get(n - 1)) {
        res.add(i, (rank[n - 1] + 1));
      } else {
        int index = binarySearch(ranked, playerScore);
        res.add(i, rank[index]);
  
      }
    }
    return res;
  
  }
  
  private static int binarySearch(List<Integer> a, int key) {
  
    int lo = 0;
    int hi = a.size() - 1;
  
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (a.get(mid) == key) {
        return mid;
      } else if (a.get(mid) < key && key < a.get(mid - 1)) {
        return mid;
      } else if (a.get(mid) > key && key >= a.get(mid + 1)) {
        return mid + 1;
      } else if (a.get(mid) < key) {
        hi = mid - 1;
      } else if (a.get(mid) > key) {
        lo = mid + 1;
      }
    }
    return -1;
  }

  // public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player){
  //   int pos = 1, temp_r = -1, temp_p = -1, r = 0, p = player.size() - 1;
  //   while(p >= 0 && r < ranked.size()){
  //     while(player.get(p) >= ranked.get(r)){
  //       player.set(p--, pos);
  //       temp_p = player.get(p);
  //       while(p >= 0 && player.get(p) == temp_p){
  //         player.set(p--, pos);
  //       }
  //     }
  //     if(ranked.get(r) != temp_r){
  //       temp_r = ranked.get(r);
  //       pos++;
  //     }
  //     r++;
  //   }
  //   while(p >= 0){
  //     if(player.get(p) != temp_p){
  //       temp_p = player.get(p);
  //       player.set(p--, pos++);
  //     }
  //     else{
  //       player.set(p--, pos);
  //     }
  //   }
  //   return player;
  // }

  // EXCEEDS TIME LIMIT BECAUSE IT PARSES RANKED FROM THE BEGINNING FOR EVERY SCORE FROM PLAYER
  // public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player){
  //   for(int i = 0; i < player.size(); i++){
  //     int pos = 1, temp = -1;
  //     for(int r : ranked){
  //       if(player.get(i) >= r){
  //         break;
  //       }
  //       if(r != temp){
  //         temp = r;
  //         pos++;
  //       }
  //     }
  //     player.set(i, pos);
  //   }
  //   return player;
  // }
}
