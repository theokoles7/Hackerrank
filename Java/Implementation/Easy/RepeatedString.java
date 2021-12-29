package Implementation.Easy;

public class RepeatedString {
  public static void main(String argts[]){
    System.out.println(repeatedString("aba", 10));  // 7
    System.out.println(repeatedString("a", 1000000000));
  }

  public static long repeatedString(String s, long n){
    int a = 0, xtra = 0;
    for(char c : s.toCharArray()){if(c == 'a'){a++;}}
    for(int i = 0; i < (n % s.length()); i++){if(s.charAt(i) == 'a'){xtra++;}}
    return (a * (n / s.length())) + xtra;
  }
}
