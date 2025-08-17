Write a program to implement Multiple Inheritance with example( Base Class-1-
Subject1(NT), Base Class-2 Subject2(OOPs), Derived Class Student(Name)-1) and Display
the Subject marks ( MID and END SEM Marks along with student details Id,Name,Branch 
// Interface for Subject1
interface Subject1 {
    void setSubject1Marks(int midMarks, int endSemMarks);
    void displaySubject1Marks();
}

// Interface for Subject2
interface Subject2 {
    void setSubject2Marks(int midMarks, int endSemMarks);
    void displaySubject2Marks();
}

// Base class for Student
class Student {
    int id;
    String name;
    String branch;

    // Constructor
    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    // Method to display student details
    void displayStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Branch: " + branch);
    }
}

// Derived class implementing multiple interfaces and extending Student class
class Result extends Student implements Subject1, Subject2 {
    int subject1MidMarks, subject1EndSemMarks;
    int subject2MidMarks, subject2EndSemMarks;

    // Constructor
    public Result(int id, String name, String branch) {
        super(id, name, branch);
    }

    // Implementing methods for Subject1 interface
    public void setSubject1Marks(int midMarks, int endSemMarks) {
        subject1MidMarks = midMarks;
        subject1EndSemMarks = endSemMarks;
    }

    public void displaySubject1Marks() {
        System.out.println("Subject 1 MID Marks: " + subject1MidMarks);
        System.out.println("Subject 1 END SEM Marks: " + subject1EndSemMarks);
    }

    // Implementing methods for Subject2 interface
    public void setSubject2Marks(int midMarks, int endSemMarks) {
        subject2MidMarks = midMarks;
        subject2EndSemMarks = endSemMarks;
    }

    public void displaySubject2Marks() {
        System.out.println("Subject 2 MID Marks: " + subject2MidMarks);
        System.out.println("Subject 2 END SEM Marks: " + subject2EndSemMarks);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Result object
        Result student1 = new Result(101, "John", "CSE");

        // Setting and displaying marks for Subject 1
        student1.setSubject1Marks(75, 85);
        // Setting and displaying marks for Subject 2
        student1.setSubject2Marks(80, 90);

        // Displaying student details
        student1.displayStudentDetails();

        // Displaying marks for Subject 1
        student1.displaySubject1Marks();

        // Displaying marks for Subject 2
        student1.displaySubject2Marks();
    }
}
