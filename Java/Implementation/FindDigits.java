package Implementation;

public class FindDigits {
  public static void main(String args[]){
    System.out.println(findDigits(12));   // 2
    System.out.println(findDigits(1012)); // 3
  }

  public static int findDigits(int n){
    int count = 0;
    for(char c : (String.valueOf(n)).toCharArray()){
      if(c != '0'){
        if(n % Character.getNumericValue(c) == 0){
          count++;
        }
      }
    }
    return count;
  }
}
