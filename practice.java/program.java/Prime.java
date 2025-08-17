import java.util.Scanner;
import java.lang.*;
class Prime{
	public static void main(String a[]){
			int num;
			int i,flag=0;
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			for(i=1;i<num/2;i++){
				if(num%2==0){
					flag=1;
					}
				}
			
if(flag==1){
System.out.println("is not a prime number");
}
else{
System.out.println("is a prime");
}
}
}