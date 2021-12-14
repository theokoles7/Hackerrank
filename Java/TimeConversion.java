public class TimeConversion {
  public static void main(String args[]){
    System.out.println(timeConversion("12:05:45PM"));
    System.out.println(timeConversion("12:05:45AM"));
    System.out.println(timeConversion("07:05:45PM"));
    System.out.println(timeConversion("07:05:45AM"));
  }

  public static String timeConversion(String s){
    if(s.charAt(s.length() - 2) == 'A'){
      if(Integer.valueOf(s.substring(0, 2)) != 12){return s.substring(0, s.length() - 2);}
      else{return "00" + s.substring(2, s.length() - 2);}
    }else{
      if(Integer.valueOf(s.substring(0, 2)) == 12){return s.substring(0, s.length() - 2);}
      else{return String.valueOf(Integer.valueOf(s.substring(0, 2)) + 12) + s.substring(2, s.length() - 2);}
    }
  }
}
