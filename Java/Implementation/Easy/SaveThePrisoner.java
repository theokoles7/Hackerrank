package Implementation.Easy;

public class SaveThePrisoner {
  public static void main(String args[]){
    System.out.println(saveThePrisoner(4, 6, 2));   // 3
    System.out.println(saveThePrisoner(5, 2, 1));   // 2
    System.out.println(saveThePrisoner(5, 2, 2));   // 3
    System.out.println(saveThePrisoner(7, 19, 2));  // 6
    System.out.println(saveThePrisoner(3, 7, 3));   // 3
  }

  public static int saveThePrisoner(int n, int m, int s){
    return (s + m - 2) % n + 1;
  }
}
