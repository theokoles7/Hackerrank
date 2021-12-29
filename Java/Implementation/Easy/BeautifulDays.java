package Implementation.Easy;

public class BeautifulDays {
  public static void main(String args[]){
    System.out.println(beautifulDays(20, 23, 6));
    System.out.println(reverse(5467));
  }

  public static int beautifulDays(int i, int j, int k){
    int count = 0;
    for(int t = i; t <= j; t++){
      if((t - reverse(t)) % k == 0){count++;}
    }
    return count;
  }

  public static int reverse(int n){
    int rev = 0;
    while(n != 0){
      rev = (rev * 10) + (n % 10);
      n = n / 10;
    }
    return rev;
  }
}
