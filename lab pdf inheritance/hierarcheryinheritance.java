// Write a program to implement Hierarchical Inheritance using class name Student,
student1(name), student2(name), and display the student1 and student2
respectively(id,name,batch,branch,collegename)
(Hint: Base Class-1, Derived Class-1, Derived Class-2)
class Student {
    protected int id;
    protected String name;
    protected String batch;
    protected String branch;
    protected String collegeName;

    public Student(int id, String name, String batch, String branch, String collegeName) {
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.branch = branch;
        this.collegeName = collegeName;
    }
}

class Student1 extends Student {
    public Student1(int id, String name, String batch, String branch, String collegeName) {
        super(id, name, batch, branch, collegeName);
    }

    public void displayStudent1Details() {
        System.out.println("Student 1 ID: " + id);
        System.out.println("Student 1 Name: " + name);
        System.out.println("Student 1 Batch: " + batch);
        System.out.println("Student 1 Branch: " + branch);
        System.out.println("Student 1 College Name: " + collegeName);
    }
}

class Student2 extends Student {
    public Student2(int id, String name, String batch, String branch, String collegeName) {
        super(id, name, batch, branch, collegeName);
    }

    public void displayStudent2Details() {
        System.out.println("Student 2 ID: " + id);
        System.out.println("Student 2 Name: " + name);
        System.out.println("Student 2 Batch: " + batch);
        System.out.println("Student 2 Branch: " + branch);
        System.out.println("Student 2 College Name: " + collegeName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1(123, "John Doe", "2023", "Computer Science", "ABC College");
        Student2 student2 = new Student2(456, "Jane Smith", "2024", "Electrical Engineering", "XYZ University");

        System.out.println("Displaying Student 1 Details:");
        student1.displayStudent1Details();

        System.out.println("\nDisplaying Student 2 Details:");
        student2.displayStudent2Details();
    }
}
