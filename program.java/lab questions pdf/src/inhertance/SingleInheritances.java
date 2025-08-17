package inhertance;
// Write a program to implement Multilevel Inheritance using class names as
//Grandparent, Parent and Child; Display the details of the family members?
class Grandparent {
    protected String grandparentName;
    protected int grandparentAge;

    public Grandparent(String name, int age) {
        this.grandparentName = name;
        this.grandparentAge = age;
    }

    public void displayGrandparentDetails() {
        System.out.println("Grandparent Name: " + grandparentName);
        System.out.println("Grandparent Age: " + grandparentAge);
    }
}

class Parent extends Grandparent {
    protected String parentName;
    protected int parentAge;

    public Parent(String grandparentName, int grandparentAge, String parentName, int parentAge) {
        super(grandparentName, grandparentAge);
        this.parentName = parentName;
        this.parentAge = parentAge;
    }

    public void displayParentDetails() {
        displayGrandparentDetails();
        System.out.println("Parent Name: " + parentName);
        System.out.println("Parent Age: " + parentAge);
    }
}

class Child extends Parent {
    private String childName;
    private int childAge;

    public Child(String grandparentName, int grandparentAge, String parentName, int parentAge, String childName, int childAge) {
        super(grandparentName, grandparentAge, parentName, parentAge);
        this.childName = childName;
        this.childAge = childAge;
    }

    public void displayChildDetails() {
        displayParentDetails();
        System.out.println("Child Name: " + childName);
        System.out.println("Child Age: " + childAge);
    }
}

 class SingleInheritances {
    public static void main(String[] args) {
        Grandparent g=new Grandparent("tata",89);
        g.displayGrandparentDetails();
        Child child = new Child("Grandpa", 70, "Dad", 40, "John", 20);
        child.displayChildDetails();
    }
}

