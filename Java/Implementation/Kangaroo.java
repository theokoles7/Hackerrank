package Implementation;

public class Kangaroo {
  public static void main(String args[]){
    System.out.println(kangaroo(0, 3, 4, 2));   //Yes
    System.out.println(kangaroo(0, 2, 5, 3));   //No
    System.out.println(kangaroo(14, 4, 98, 2)); //Yes
    System.out.println(kangaroo(4523, 8092, 9419, 8076)); //Yes
    System.out.println(kangaroo(2081, 8403, 9107, 8400)); //Yes
    System.out.println(kangaroo(1571, 4240, 9023, 4234)); //Yes
  }

  public static String kangaroo(int x1, int v1, int x2, int v2){
    if((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1)){return "NO";}
    for(int x = 0; x < 10000; x++){
      if((v1 * x + x1) == (v2 * x + x2)){return "YES";}
    }
    return "NO";
  }
}
