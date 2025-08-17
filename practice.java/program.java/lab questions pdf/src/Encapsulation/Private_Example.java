package Encapsulation;

public class Private_Example {
}
//add class definitions below this line



//add class definitions above this line

class ExampleClass {
    private int num1;
    private int num2;

    public ExampleClass(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    public String describe() {
        return ("My numbers are: " + num1 + " and " + num2);
    }

    public int sum() {
        return num1 + num2;
    }
}

//add class definitions above this line
class Encapsulation {
    public static void main(String[] args) {

        ExampleClass myExample = new ExampleClass(5, 7);
        System.out.println(myExample.describe());
        System.out.println(myExample.sum());
//        System.out.println(myExample.num1);//here num1 and num2 are private so by printing the it as instance is leads to error
//        System.out.println(myExample.num2);

        //add code below this line



        //add code above this line
    }
}
