package Implementation;

public class PageCount {
  public static void main(String args[]){
    System.out.println(pageCount(5, 3));  // 1
    System.out.println(pageCount(6, 2));  // 1
    System.out.println(pageCount(5, 4));  // 0
    System.out.println(pageCount(6, 5));  // 1
  }

  public static int pageCount(int n, int p){
    if(p > (n / 2)){
      return ((n - p) + (p % 2)) / 2;
    }
    return p / 2;
  }
}
