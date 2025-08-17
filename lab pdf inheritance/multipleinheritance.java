
//. Write a program to implement Multiple Inheritance using class names as Father,
Mother and Child; Display the details of family members? 
interface Father {
    void displayFatherDetails();
}

interface Mother {
    void displayMotherDetails();
}

class Child implements Father, Mother {
    private String childName;
    private int childAge;

    public Child(String childName, int childAge) {
        this.childName = childName;
        this.childAge = childAge;
    }

    @Override
    public void displayFatherDetails() {
        System.out.println("Father's Details:");
        // Display father's details here
    }

    @Override
    public void displayMotherDetails() {
        System.out.println("Mother's Details:");
        // Display mother's details here
    }

    public void displayChildDetails() {
        System.out.println("Child's Details:");
        System.out.println("Name: " + childName);
        System.out.println("Age: " + childAge);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child("John", 10);
        child.displayFatherDetails();
        child.displayMotherDetails();
        child.displayChildDetails();
    }
}
