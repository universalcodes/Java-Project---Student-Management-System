package a.student.console.app;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BStudentDetails {


    private String name;
    private int age;
    private String studentID;
    private List<String> coursesList;

    BStudentDetails(String name, int age, String studentID) {
        if (validateStudentAge(age) && validateStudentName(name) && validateStudentID(studentID)) {
            this.name = name;
            this.age = age;
            this.studentID = studentID;
            coursesList = new ArrayList<>();
        }
    }

    public void enrollNewCourse(String newCourseEnrolled) {
        if (!coursesList.contains(newCourseEnrolled) && validateCourseList(newCourseEnrolled)) {
            coursesList.add(newCourseEnrolled);
            System.out.println("New Course named as " + newCourseEnrolled + " has been added successfully ");
        } else {
            System.out.println("Invalid Course : "+ newCourseEnrolled);
        }
    }

    public void retrieveStudentInfo() {
        System.out.println("Student Name as Follows\t" + name);
        System.out.println("Student Age as Follows\t" + age);
        System.out.println("Student ID as Follows\t" + studentID);
        System.out.println("Student Courses as Follows\t" + coursesList);
    }

    @Override
    public String toString() {
        return "BStudentDetails [ name = " + name + "]" + "[" + "age = " + age + "]" + "[" + "studentID = " + studentID + "]" + "[" + "Courses = " + coursesList + "]";
    }


    private boolean validateStudentAge(int age) {
        if (age >= 14 && age <= 70) {
            return true;
        } else {
            System.err.println("Student age must be between 14 & 70");
        }
        return false;
    }


    private boolean validateStudentName(String name) {
        // In the following code where we have used regular expression , where A-Z Alphabets are allowed with following formats : 1) Uppercase 2) Lowercase
        // \\s is the regular expression which helps to allowed spaces within the names
        // +$ which helps String must be ended with Alphabet

        String namePattern = "^[a-zA-Z\\s]+$";
        Pattern compileTheGivenPattern = Pattern.compile(namePattern);
        Matcher matchPatternResult = compileTheGivenPattern.matcher(name);

        if (matchPatternResult.matches()) {
            return true;
        } else {
            System.err.println("Name is Invalid, Only Alphabets are allowed");
        }
        return false;
    }

    private boolean validateStudentID(String studentID) {
        String idPattern = "^[a-zA-Z]-\\d+$";
        Pattern compilePatternNumber = Pattern.compile(idPattern);
        Matcher matchPatternNumberResult = compilePatternNumber.matcher(studentID);

        if (matchPatternNumberResult.matches()) {
            return true;
        } else {
            System.out.println("Invalid Student ID, ");
            return false;
        }

    }

    public boolean validateCourseList(String enrolledCourseName) {
        if (enrolledCourseName.equalsIgnoreCase("Manual Testing") || enrolledCourseName.equalsIgnoreCase("Java") ||
                enrolledCourseName.equalsIgnoreCase("Javascript") || enrolledCourseName.equalsIgnoreCase("TypeScript") ||
                enrolledCourseName.equalsIgnoreCase("Selenium") || enrolledCourseName.equalsIgnoreCase("Playwright") ||
                enrolledCourseName.equalsIgnoreCase("SQL") || enrolledCourseName.equalsIgnoreCase("Prosgres") ||
                enrolledCourseName.equalsIgnoreCase("GIT") || enrolledCourseName.equalsIgnoreCase("CI/CD Pipeline") ||
                enrolledCourseName.equalsIgnoreCase("Docker Deployment") || enrolledCourseName.equalsIgnoreCase("AWS Testing") ||
                enrolledCourseName.equalsIgnoreCase("Jmeter") || enrolledCourseName.equalsIgnoreCase("SDET") ||
                enrolledCourseName.equalsIgnoreCase("QA Lead") || enrolledCourseName.equalsIgnoreCase("SDET Essentials")) {
            System.out.println("Valid Course is Selected from list :"+enrolledCourseName);
                return true;

        }

        else
        {
            System.out.println(enrolledCourseName + " is not part of Course provided in the list");
            return false;
        }
    }
        public static void main (String[] args){
            System.out.println("Step 1 - Declare Instance (Non Static )Variable within the class");
            System.out.println("Step 2 - Create Constructor & Define All Instance (Non Static ) Variable using this keyword ");
            System.out.println("Step 3 - create One Method  where it prints all Values");
            System.out.println("Step 4 - Optional if we want to print all Variables in Single line use ToString() method");


        }
    }
