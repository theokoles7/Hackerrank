public class StairCase {
  public static void main(String args[]){
    staircase(6);
  }

  public static void staircase(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 0; j < n; j++){
        if(j < n - i){System.out.print(" ");}
        else{System.out.print("#");}
      }
      System.out.print("\n");
    }
  }
}
