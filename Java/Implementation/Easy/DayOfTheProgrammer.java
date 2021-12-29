package Implementation.Easy;

public class DayOfTheProgrammer {
  public static void main(String args[]){
    System.out.println(dayOfTheProgrammer(2017));
    System.out.println(dayOfTheProgrammer(2016));
    System.out.println(dayOfTheProgrammer(1800));
    System.out.println(dayOfTheProgrammer(2100));
    System.out.println(dayOfTheProgrammer(2000));
    System.out.println(dayOfTheProgrammer(1918));
  }

  public static String dayOfTheProgrammer(int year){
    if(year < 1918){
      if(Integer.valueOf(year) % 4 == 0){
        return "12.09." + year;
      }
      return "13.09." + year;
    }else if(year > 1918){
      if((Integer.valueOf(year) % 4 == 0 && Integer.valueOf(year) % 100 != 0) || Integer.valueOf(year) % 400 == 0){
        return "12.09." + year;
      }
      return "13.09." + year;
    }else return "26.09.1918";
  }
}
