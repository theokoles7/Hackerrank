package Implementation;

public class LibraryFine {
  public static void main(String args[]){
    System.out.println(libraryFine(14, 7, 2018, 5, 7, 2018)); // 135
    System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));  // 45
    System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));  // 0
  }

  public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2){
    if(y1 < y2){return 0;}
    else if(y1 == y2){
      if(m1 < m2){return 0;}
      else if(m1 == m2){
        if(d1 <= d2){
          return 0;
        }else{return 15 * (d1 - d2);}
      }else{return 500 * (m1 - m2);}
    }else{return 10000 * (y1 - y2);}
  }
}
