package a.student.console.app;

import java.util.ArrayList;
import java.util.List;

public class BStudentDetails {


    private String name;
    private int age;
    private int studentID;
    private List<String> coursesList;

    BStudentDetails(String name, int age, int studentID)
    {
        if(validateData(age)) {
            this.name = name;
            this.age = age;
            this.studentID = studentID;
            coursesList = new ArrayList<>();
        }
    }

    public void enrollNewCourse(String newCourseEnrolled)
    {
        coursesList.add(newCourseEnrolled);
    }

    public void retraiveStudentInfo()
    {
        System.out.println("Student Name as Follows\t"+name);
        System.out.println("Student Age as Follows\t"+age);
        System.out.println("Student ID as Follows\t"+studentID);
        System.out.println("Student Courses as Follows\t"+coursesList);
    }

    @Override
    public String toString()
    {
        return "BStudentDetails [ name = "+ name + "]" + "["+ "age = "+ age + "]" + "["+ "studentID = "+ studentID +  "]" + "["+ "Courses = "+ coursesList +  "]" ;
    }


    public boolean validateData(int age)
    {
        if(age >=14 && age<=70)
        {
            return true;
        }
        else
        {
            System.err.println("Student age must be between 14 & 70");
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Step 1 - Declare Instance (Non Static )Variable within the class");
        System.out.println("Step 2 - Create Constructor & Define All Instance (Non Static ) Variable using this keyword ");
        System.out.println("Step 3 - create One Method  where it prints all Values");
        System.out.println("Step 4 - Optional if we want to print all Variables in Single line use ToString() method");


    }
}
