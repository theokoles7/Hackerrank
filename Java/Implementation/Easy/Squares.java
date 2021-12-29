package Implementation.Easy;

public class Squares {
  public static void main(String args[]){
    System.out.println(squares(3, 9));    // 2
    System.out.println(squares(17, 24));  // 0
  }

  public static int squares(int a, int b){
    int i = 0, count = 0;
    while(i * i <= b){
      if(i * i >= a){count++;}
      i++;
    }
    return count;
  }
}
