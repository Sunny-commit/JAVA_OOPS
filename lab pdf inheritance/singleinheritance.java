//User
//Write a program to implement Single Inheritance using class names as student,
//mystudent and display student details.(id,name,batch,branch,college name etc) 

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
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Batch: " + batch);
        System.out.println("Branch: " + branch);
        System.out.println("College Name: " + collegeName);
    }
}

class MyStudent extends Student {
    public MyStudent(int id, String name, String batch, String branch, String collegeName) {
        super(id, name, batch, branch, collegeName);
    }
}

public class singleinheritance {
    public static void main(String[] args) {
	Student student=new Student();
        MyStudent student1 = new MyStudent(123, "John Doe", "2023", "Computer Science", "ABC College");
        student.displayDetails();
    }
}
