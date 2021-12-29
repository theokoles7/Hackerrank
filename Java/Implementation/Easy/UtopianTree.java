package Implementation.Easy;

public class UtopianTree {
  public static void main(String args[]){
    System.out.println(utopianTree(0)); // 1
    System.out.println(utopianTree(1)); // 2
    System.out.println(utopianTree(4)); // 7
  }

  public static int utopianTree(int n){
    int sum = 1;
    for(int i = 0; i < n; i++){
      if(i % 2 == 0){
        sum = sum * 2;
      }else{
        sum++;
      }
    }
    return sum;
  }
}
