package studentdatabaseapp
  import java.util.Scanner;
  public class StudentDatabaseApp{
    public static void main(String[] args){
      System.out.print("enter no. of new students to enroll:");
       Scanner sc = new Scanner(System.in);
      int numofstudents = sc.nextInt();
      Student[] students = new Student[numofstudents];

      for(int n=0;n<numofstudents;n++){
        students[n]=new Student();
        students[n].enroll();
         students[n].paytuition();
      }
      for(int n=0;n<numofstudents;n++){
        System.out.println(students[n].toString()); 
      }
      

    }
  }
