package Implementation.Easy;

public class TaumBDay {
  public static void main(String args[]){
    System.out.println(taumBday(10, 10, 1, 1, 1));  // 20
    System.out.println(taumBday(5, 9, 2, 3, 4));    // 37
    System.out.println(taumBday(3, 6, 9, 1, 1));    // 12
    System.out.println(taumBday(7, 7, 4, 2, 1));    // 35
    System.out.println(taumBday(3, 3, 1, 9, 2));    // 12
  }

  public static long taumBday(int b, int w, int bc, int wc, int z){
    if((wc + z) < bc){
      return ((long)w * (long)wc) + ((long)b * (long)wc) + ((long)b * (long)z);
    }else if((bc + z) < wc){
      return ((long)b * (long)bc) + ((long)w * (long)bc) + ((long)w * (long)z);
    }
    return ((long)b * (long)bc) + ((long)w * (long)wc);
  }
}
