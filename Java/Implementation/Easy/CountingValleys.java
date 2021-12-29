package Implementation.Easy;

public class CountingValleys {
  public static void main(String args[]){
    System.out.println(countingValleys(8, "UDDDUDUU"));
    System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
  }
  public static int countingValleys(int steps, String path){
    int alt = 0, valleys = 0;
    for(char step : path.toCharArray()){
      if(step == 'D'){
        if(alt == 0){valleys++;}
        alt--;}
      if(step == 'U'){alt++;}
    }
    return valleys;
  }

}
