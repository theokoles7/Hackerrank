package Implementation;

public class JumpingOnClouds {
  public static void main(String args[]){
    int[] c1 = {0, 0, 1, 0};
    int[] c2 = {0, 0, 1, 0, 0, 1, 1, 0};
    int[] c3 = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
    int[] c4 = {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1};
    System.out.println(jumpingOnClouds(c1, 2)); // 96
    System.out.println(jumpingOnClouds(c2, 2)); // 96
    System.out.println(jumpingOnClouds(c3, 3)); // 96
    System.out.println(jumpingOnClouds(c4, 19)); // 96
  }

  public static int jumpingOnClouds(int[] c, int k){
    int e = 99;
    if(c[0] == 1){e -= 2;}
    if(c.length == k){return e;}
    for(int i = k; i != 0; i = (i + k) % c.length){
      if(c[i] == 1){e -= 2;}
      e--;
    }
    return e;
  }
}
