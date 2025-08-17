import java.util.Scanner;
import java.lang.*;
class Largest{
public static void main(String as[]){
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println("a valus is :"+a);
System.out.println("b valus is :"+b);
System.out.println("c valus is :"+c);
if(a>=b && a>=c){
System.out.println(a+"is the greatest number");
}
else if(b>=a && b>=c){
System.out.println(b+"is the greatest number");
}
else{
System.out.println(c+"is the greatest number");
}
}
}