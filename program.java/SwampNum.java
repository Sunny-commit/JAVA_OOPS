import java.util.Scanner;
import java.lang.*;
class SwapNum{
public static void main(String a[]){
int b=10,c=5;
System.out.println("--before swap----");
System.out.println(" b is :"+b);
System.out.println(" c is :"+c);
b=b-c;
c=b+c;
b=c-b;
System.out.println("--after swap----");
System.out.println(" b is :"+b);
System.out.println(" c is :"+c);
}
}