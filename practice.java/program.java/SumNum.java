import java.util.Scanner;
import java.lang.*;
class SumNum{
public static void main(String arr[]){
int num,i,sum=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(i=1;i<=num;i++){
sum=sum+i;
}
System.out.println("sum of"+num+"natural numbers are"+sum);
}
}
