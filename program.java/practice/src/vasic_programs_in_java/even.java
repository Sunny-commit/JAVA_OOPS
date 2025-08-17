package vasic_programs_in_java;
import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.lang.String;
public class even {

    void Even() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("is even number:");
        } else {
            System.out.println("is a odd number:");
        }
    }

    void Largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.println("enter the 2st number:");
        int num2 = sc.nextInt();
        System.out.println("enter the 3st number:");
        int num3 = sc.nextInt();
        int large = num1;
        if (num2 > large) {
            large = num2;
        }
        if (num3 > large) {
            large = num3;
        }
        System.out.println("the largest number is :" + large);
    }

    void palindrome() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the numbr you entered is:" + num);
        int b = num;
        int rev = 0;
        while (num != 0) {
            num = num % 10;
            rev = rev * 10 + num;
            num = num / 10;
        }
        if (rev == b) {
            System.out.println("is a palindrome:");
        } else {
            System.out.println("is not a palindrome");
        }
    }


    void prime() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("is a prime number:");
            } else {
                System.out.println("is not a prime number:");
            }
        }
    }


    void leap() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println("is aleap year");
        } else {
            System.out.println("is not aleap year");
        }
    }


    void swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num1 = sc.nextInt();
        System.out.println("enter another number:");
        int num2 = sc.nextInt();
        System.out.println("before swaping" + num1 + "and" + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("after swaping" + num1 + "and" + num2);
    }


    Scanner sc = new Scanner(System.in);
    int next = 0;

    int fibonocci() {
        System.out.println("enter the no of fibanocci:");
        int num = sc.nextInt();
        int a = 0, b = 1, c;
        if (num == 0) {
            return a;
        }
        for (int i = 2; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

class menu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        even e=new even();
        int flag=0,choice;
        System.out.println("1.even\n2.largest\n3.palindrome\n4.primenumber\n5.leapnumber\n6.swap\n7.fibonacci\n");
        while(flag!=1){
            System.out.println("enter the choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    e.Even();
                    break;
                case 2:
                    e.Largest();
                    break;
                case 3:
                    e.palindrome();
                    break;
                case 4:
                    e.prime();
                    break;
                case 5:
                    e.leap();
                    break;
                case 6:
                    e.swap();
                    break;
                case 7:
                    e.fibonocci();
                    break;
                case 8:
                    System.out.println("fo you want ot exit or no");
                    System.out.println("click 1 fro yes and 0 for no");
                    flag=sc.nextInt();
                    if(flag==1){
                        System.out.println("");
                    }
            }

        }
    }
}