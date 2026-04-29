package a.student.console.app;

public class AMainImplementation {
    public static void main(String[] args) {
        System.out.println("**********------Student Management System----------***********************");

        System.out.println("Step 1 - Invoke the Constructor with BStudentDetails() with defined Parameters ");
        System.out.println("Step 2 - call printFirstStudentDetails Method using dot operator where it prints all Values");
        System.out.println("Step 3 - Optional call printFirstStudentDetails directly to print all Variables in Single line use ToString() method");


        //Usecase 1 Data
        System.out.println("Printing Student Details 1");


        BStudentDetails printFirstStudentDetails1 = new BStudentDetails("JAVA USER", 16, "A-34567");
        printFirstStudentDetails1.enrollNewCourse("Java");
        printFirstStudentDetails1.enrollNewCourse("QA Lead");
        printFirstStudentDetails1.enrollNewCourse("Phyton");
        System.out.println(printFirstStudentDetails1); // printing the student details through methods
        printFirstStudentDetails1.retrieveStudentInfo(); // printing the method based on toString method

        System.out.println("Printing Student Details 2");


        //Usecase 2 Data
        BStudentDetails printFirstStudentDetails2 = new BStudentDetails("JaVa UsER", 16, "T-34562");
        printFirstStudentDetails2.enrollNewCourse("Playwright");
        printFirstStudentDetails2.enrollNewCourse("Javascript");
        System.out.println(printFirstStudentDetails2); // printing the student details through methods
        printFirstStudentDetails2.retrieveStudentInfo(); // printing the method based on toString method

//        //Usecase 3 Data
//        BStudentDetails printFirstStudentDetails3 = new BStudentDetails("java User", 16, "v-35451");
//        //Usecase 4 Data
//        BStudentDetails printFirstStudentDetails4 = new BStudentDetails("Java", 16, "D-34562");
//        //Usecase 5 Data
//        BStudentDetails printFirstStudentDetails5 = new BStudentDetails("java Important User", 16, "f-23456");
//        //Usecase 6 Data
//        BStudentDetails printFirstStudentDetails6 = new BStudentDetails("java Important User", 16, "f-234561A");
//        //Usecase 6 Data
//        BStudentDetails printFirstStudentDetails7 = new BStudentDetails("java Important User", 16, "%3456");

//
//        System.out.println(printFirstStudentDetails3); // printing the student details through methods
//        System.out.println(printFirstStudentDetails4); // printing the student details through methods
//        System.out.println(printFirstStudentDetails5); // printing the student details through methods
//        System.out.println(printFirstStudentDetails6); // printing the student details through methods
//        System.out.println(printFirstStudentDetails7); // printing the student details through methods
        //printFirstStudentDetails.retraiveStudentInfo(); // printing the method based on toString method
    }
}
