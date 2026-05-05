package a.student.console.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AMainImplementation {

    // Global List to store all student details
    static List<BStudentDetails> fetchStudentDetails = new ArrayList<>();

    // Global variable to hold search result (used in findStudentID)
    static BStudentDetails getStudentResult;

    /**
     * Method to find student by ID
     * @param studentID - ID to search
     * @return BStudentDetails object if found, else null
     */
    public static BStudentDetails findStudentID(String studentID) {
        try {
            // Stream filter to find student by ID
            BStudentDetails getStudentDetails = fetchStudentDetails.stream()
                    .filter(findStudentIDVariable -> findStudentIDVariable.getStudentID()
                            .equalsIgnoreCase(studentID))
                    .findFirst()
                    .orElseThrow(() -> {
                        System.err.println("Invalid Student ID : " + studentID);
                        return new RuntimeException("Invalid Student ID : " + studentID);
                    });
            return getStudentDetails;
        } catch (RuntimeException exceptionOutput) {
            System.err.println("Exception Message : Invalid Student as follows\t" + studentID);
        }
        return getStudentResult; // returns null if not found
    }

    /**
     * Method to sort students by Name
     * Uses Comparator with Collections.sort
     */
    public static void sortStudentDetailsByName() {
        Comparator<BStudentDetails> sortStudentsByName =
                (compareO1, compareO2) -> compareO1.getStudentName().compareTo(compareO2.getStudentName());

        Collections.sort(fetchStudentDetails, sortStudentsByName);

        System.out.println("Sorted Student List by Name:");
        System.out.println(fetchStudentDetails);
    }

    public static void main(String[] args) {
        System.out.println("**********------Student Management System----------***********************");

        // Step-wise instructions
        System.out.println("Step 1 - Create Student Objects using Constructor");
        System.out.println("Step 2 - Enroll Courses for each Student");
        System.out.println("Step 3 - Print Student Details using toString() and retrieveStudentInfo()");
        System.out.println("Step 4 - Store Students in List and perform operations");

        // ------------------- Usecase 1 -------------------
        System.out.println("\nPrinting Student Details 1");
        BStudentDetails student1 = new BStudentDetails("Devesh", 16, "A-34567");
        student1.enrollNewCourse("Java");
        student1.enrollNewCourse("QA Lead");
        student1.enrollNewCourse("Phyton"); // Invalid course handled
        System.out.println(student1);
        student1.retrieveStudentInfo();

        // ------------------- Usecase 2 -------------------
        System.out.println("\nPrinting Student Details 2");
        BStudentDetails student2 = new BStudentDetails("MaheSh", 16, "T-34562");
        student2.enrollNewCourse("Playwright");
        student2.enrollNewCourse("Javascript");
        System.out.println(student2);
        student2.retrieveStudentInfo();

        // ------------------- Usecase 3 -------------------
        System.out.println("\nPrinting Student Details 3");
        BStudentDetails student3 = new BStudentDetails("Yogesh", 16, "T-34562");
        student3.enrollNewCourse("Playwright");
        student3.enrollNewCourse("Javascript");
        System.out.println(student3);
        student3.retrieveStudentInfo();

        // ------------------- Usecase 4 -------------------
        System.out.println("\nPrinting Student Details 4");
        BStudentDetails student4 = new BStudentDetails("Akash", 16, "T-34562");
        student4.enrollNewCourse("Playwright");
        student4.enrollNewCourse("Javascript");
        System.out.println(student4);
        student4.retrieveStudentInfo();

        // ------------------- Store Students in List -------------------
        System.out.println("\nPrinting Student Details through List");
        fetchStudentDetails.add(student1);
        fetchStudentDetails.add(student2);
        fetchStudentDetails.add(student3);
        fetchStudentDetails.add(student4);
        System.out.println(fetchStudentDetails);

        // ------------------- Search Students -------------------
        System.out.println("\nFinding Valid Student ID from List");
        BStudentDetails result1 = findStudentID("A-34567");
        System.out.println(result1);

        System.out.println("\nFinding Second Valid Student ID from List");
        BStudentDetails result2 = findStudentID("T-34562");
        System.out.println(result2);

        System.out.println("\nFinding Invalid Student ID from List");
        BStudentDetails resultInvalid = findStudentID("T-345612");
        System.out.println(resultInvalid);

        // ------------------- Sort Students -------------------
        System.out.println("\nRetrieve Sorted Names of Student Details");
        sortStudentDetailsByName();
    }
}
