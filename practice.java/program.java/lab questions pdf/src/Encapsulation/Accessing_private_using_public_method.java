package Encapsulation;

public class Accessing_private_using_public_method {
}
//add class definitions below this line



//add class definitions above this line
//add class definitions below this line

class PrivateExample {
    private int num;

    public PrivateExample(int n) {
        num = n;
    }

    public void publicMethod() {
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("The double of " + num + " is: " + num * 2);
        System.out.println(num + " squared is: " + num * num);
    }
}

//add class definitions above this line
 class PrivateKeyword {
    public static void main(String[] args) {
        PrivateExample myExample = new PrivateExample(5);
        //private method in class makes error because instance cannot directly access a private method.
       // myExample.privateMethod();
//using public method to access the private methods
 myExample.publicMethod();

        //add code below this line



        //add code above this line
    }
}
