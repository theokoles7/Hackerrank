package Implementation.Easy;

public class CatAndMouse {
  public static void main(String args[]){
    System.out.println(catAndMouse(1, 2, 3));
    System.out.println(catAndMouse(1, 3, 2));
  }

  public static String catAndMouse(int x, int y, int z){
    if(Math.max(x, z) - Math.min(x, z) < Math.max(y, z) - Math.min(y, z)){return "Cat A";}
    else if(Math.max(y, z) - Math.min(y, z) < Math.max(x, z) - Math.min(x, z)){return "Cat B";}
    else{return "Mouse C";}
  }
}
