package studentdatabaseapp;
import java.util.Scanner;
public class Student{
  private String firstname;
  private String lastname;
  private int year;
  private int StudentID;
  private String courses;
  private int tuitionbalance;
  private int costofcourses=499;
  private int id=1000;
  public Student(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your first name:");
    this.firstname = sc.nextLine();
     System.out.println("enter your last name:");
    this.lastname = sc.nextLine();
     System.out.println("1 - freshmen\n2 - junior\n3 - senior\nenter your year:");
    this.year = sc.nextInt();
     setstudentID();
     System.out.println(firstname+" "+lastname+" "+year+" "+studentID);
  }
  private void setstudentID(){
    id++;
    this.studentID=year+" "+studentID;
  }
  public void enroll(){
    do{
       System.out.println("enter course to enroll(q to quit):");
      Scanner sc = new Scanner(System.in);
      String courses = sc.nextLine();
      if(!course.equals("q"){
        courses = courses+"\n"+course;
        tuitionbalance = tuitionbalance+costofcourse;
      }
      else{
         break;
      }
    }while(1 !=0){
       System.out.println("enrolled in:"+courses);
       System.out.println("tuitionbalance:"+tuitionbalance);
    }
  }
  
  
  
}
