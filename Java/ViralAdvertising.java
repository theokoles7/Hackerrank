package Implementation;

public class ViralAdvertising {
  public static void main(String args[]){
    System.out.println(viralAdvertising(5));  //24
    System.out.println(viralAdvertising(3));  //9
  }

  public static int viralAdvertising(int n){
    int sum = 0, p = 5;
    for(int i = 1; i <= n; i++){
      sum += Math.floor(p / 2);
      p = (int)Math.floor(p / 2) * 3;
    }
    return sum;
  }
}
