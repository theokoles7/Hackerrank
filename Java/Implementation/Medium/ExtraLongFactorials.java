package Implementation.Medium;

import java.math.BigInteger;

public class ExtraLongFactorials {
  public static void main(String args[]){
    extraLongFactorials(30);  // 265252859812191058636308480000000
    extraLongFactorials(25);  // 15511210043330985984000000
  }

  public static void extraLongFactorials(int n){
    BigInteger fac = BigInteger.ONE;
    for(long i = 1; i <= n; i++){
      fac = fac.multiply(BigInteger.valueOf(i));
    }
    System.out.println(fac);
  }
}
