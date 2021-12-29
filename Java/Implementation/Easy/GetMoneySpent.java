package Implementation.Easy;

public class GetMoneySpent {
  public static void main(String args[]){
    int[] keyboards1 = {3, 1};
    int[] drives1 = {5, 2, 8};

    int[] keyboards2 = {4};
    int[] drives2 = {5};

    System.out.println(getMoneySpent(keyboards1, drives1, 10));
    System.out.println(getMoneySpent(keyboards2, drives2, 5));
  }

  public static int getMoneySpent(int[] keyboards, int[] drives, int b){
    int max = -1;
    for(int kb : keyboards){
      for(int d : drives){
        if(kb + d > max && kb + d <= b){
          max = kb + d;
        }
      }
    }
    return max;
  }
}
