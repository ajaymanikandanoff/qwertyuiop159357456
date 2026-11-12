// Ex : 1a - Demonstrate simple print, class and object creation in java

class Student {
    // Data members (Instance variables)
    int regNo;
    String name;
    String section;

    // Method to display student details
    void display() {
        System.out.println("----- Student Details -----");
        System.out.println("Register Number : " + regNo);
        System.out.println("Name            : " + name);
        System.out.println("Section         : " + section);
    }
}

public class Ex1a {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student s1 = new Student();

        // Assigning values to object's data members
        s1.regNo = 101;
        s1.name = "Ajay";
        s1.section = "A";

        // Calling display() method to print student details
        s1.display();
    }
}
