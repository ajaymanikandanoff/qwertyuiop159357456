// Ex : 5 - Demonstrate the use of Inheritance (Hospital Management System)

// Superclass
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Subclass 1: Doctor inherits from Person
class Doctor extends Person {
    String specialization;

    void displayDoctor() {
        System.out.println("----- Doctor Details -----");
        displayPerson(); // Call superclass method
        System.out.println("Specialization : " + specialization);
    }
}

// Subclass 2: Patient inherits from Person
class Patient extends Person {
    String disease;

    void displayPatient() {
        System.out.println("\n----- Patient Details -----");
        displayPerson(); // Call superclass method
        System.out.println("Disease        : " + disease);
    }
}

public class Ex5 {
    public static void main(String[] args) {
        // Creating Doctor object
        Doctor d = new Doctor();
        d.name = "Dr. Vignesh";
        d.age = 45;
        d.specialization = "Cardiologist";

        // Creating Patient object
        Patient p = new Patient();
        p.name = "Kavitha";
        p.age = 30;
        p.disease = "Hypertension";

        // Display details
        d.displayDoctor();
        p.displayPatient();
    }
}
