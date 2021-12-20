package Implementation;

import java.util.*;

public class BonAppetit {
  public static void main(String args[]){
    bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
    bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
  }

  public static void bonAppetit(List<Integer> bill, int k, int b){
    int owed = 0;
    for(int i = 0; i < bill.size(); i++){
      if(i != k){
        owed += bill.get(i);}
    }
    if((owed / 2) != b){
      System.out.println(b - (owed / 2));
    }else{
      System.out.println("Bon Appetit");
    }
  }
}
