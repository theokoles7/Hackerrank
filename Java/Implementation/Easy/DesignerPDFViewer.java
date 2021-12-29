package Implementation.Easy;

import java.util.*;

public class DesignerPDFViewer {
  public static void main(String args[]){
    System.out.println(designerPDFViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), "abc"));
    System.out.println(designerPDFViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7), "zaba"));
  }

  public static int designerPDFViewer(List<Integer> h, String word){
    int max = -1;
    for(char c : word.toCharArray()){
      char l = 'a';
      for(int j = 0; j < h.size(); j++, l++){
        if(c == l){
          max = Math.max(max, h.get(j));
          break;
        }
      }
    }
    return max * word.length();
  }
}
