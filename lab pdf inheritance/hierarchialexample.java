Write a program to implement Hierarchical Inheritance with example( Base ClassStudent, Derived Class – student1, Derived Class-Student2) and display the student1,and
student2 details as id,name,class,branch, college 
------------------------------------------------------------------------------------
// Base class
class Student {
    int id;
    String name;
    String className;
    String branch;
    String college;

    // Constructor
    public Student(int id, String name, String className, String branch, String college) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.branch = branch;
        this.college = college;
    }

    // Method to display student details
    void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Branch: " + branch);
        System.out.println("College: " + college);
    }
}

// Derived class Student1
class Student1 extends Student {
    // Constructor
    public Student1(int id, String name, String className, String branch, String college) {
        super(id, name, className, branch, college);
    }
}

// Derived class Student2
class Student2 extends Student {
    // Constructor
    public Student2(int id, String name, String className, String branch, String college) {
        super(id, name, className, branch, college);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Student1 and Student2
        Student1 student1 = new Student1(101, "John", "Class X", "Science", "ABC College");
        Student2 student2 = new Student2(102, "Alice", "Class XII", "Commerce", "XYZ College");

        // Displaying details of Student1 and Student2
        System.out.println("Student1 Details:");
        student1.displayStudentDetails();
        System.out.println();

        System.out.println("Student2 Details:");
        student2.displayStudentDetails();
    }
}
