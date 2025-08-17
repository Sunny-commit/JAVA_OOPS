package Class_and_Encapsulation.java;

public class Student {
    int roll;
    int phonenumber;
    String address;
}
class Main{
    public static void main(String args){
        Student john=new Student();
        Student julie=new Student();
        john.roll=20;
        john.address="india";
        john.phonenumber=12345678;
        julie.address="china";
        System.out.println(john.roll);
    }
}

