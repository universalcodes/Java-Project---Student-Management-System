package a.student.console.app;

public class AMainImplementation {
    public static void main(String[] args) {
        System.out.println("**********------Student Management System----------***********************");

        System.out.println("Step 1 - Invoke the Constructor with BStudentDetails() with defined Parameters ");
        System.out.println("Step 2 - call printFirstStudentDetails Method using dot operator where it prints all Values");
        System.out.println("Step 3 - Optional call printFirstStudentDetails directly to print all Variables in Single line use ToString() method");




        BStudentDetails printFirstStudentDetails = new BStudentDetails("Yogesh", 89, 1);
        System.out.println(printFirstStudentDetails); // printing the student details through methods
     //   printFirstStudentDetails.retraiveStudentInfo(); // printing the method based on toString method
    }
}
