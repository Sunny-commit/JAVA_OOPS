package object_class.java;
import java.util.Scanner;
//constructor using paramerized and default
public class Addition {
    int num1;
    int num2;
    //default constructor
    Addition(){
        num1=9;
        num2=2;
    }
    //parameterized constructor
    Addition(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    int add(){
        return num1+num2;
    }
    public static void main(String args[]){
        //default constructor
        Addition a=new Addition();
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //parameterized construcotr
        Addition a1=new Addition(num1,num2);
        System.out.println(a.add());
        System.out.println(a1.add());
    }
}
