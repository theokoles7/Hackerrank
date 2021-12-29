package Implementation.Easy;
import java.util.*;

public class GradingStudents {
  public static void main(String args[]){
    List<Integer> grades = Arrays.asList(73, 67, 38, 33);
    System.out.println(grades + " => " + gradingStudents(grades));
  }

  public static List<Integer> gradingStudents(List<Integer> grades){
    for(int i = 0; i < grades.size(); i++){
      if(grades.get(i) >= 38 && (5 - grades.get(i) % 5 == 1 || 5 - grades.get(i) % 5 == 2)){
        grades.set(i, grades.get(i) + (5 - (grades.get(i) % 5)));
      }
    }
    return grades;
  }
}
