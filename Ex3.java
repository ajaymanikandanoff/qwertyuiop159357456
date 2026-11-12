// Ex : 3 - Demonstrate user-defined packages and sub-packages

import College.student.Student;
import College.student.details.StudentDetails;

public class Ex3 {
    public static void main(String[] args) {
        // Create an object of Student from package College.student
        Student student = new Student("Ajay");

        // Create an object of StudentDetails from sub-package College.student.details
        StudentDetails details = new StudentDetails("Computer Science and Engineering", 3);

        System.out.println("----- College Student Information -----");
        // Invoke method from package class
        student.displayStudent();

        // Invoke method from sub-package class
        details.displayDetails();
    }
}
