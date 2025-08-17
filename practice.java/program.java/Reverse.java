import java.util.Scanner;
import java.lang.*;
class Reverse{
public static void main(String a[]){
int n,reverse=0,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("the entered digit are"+n);
while(n!=0){
temp=n%10;
reverse=10*reverse+temp;
n=n/10;
}
System.out.println("reversed digits are"+reverse);
}
}
