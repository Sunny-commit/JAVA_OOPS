import java.util.*;
import java.lang.*;
class Among_Three{
public static void main(String a[]){
System.out.println("Hello world");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if(x>y){
	if(y>z){
		System.out.println("y is greatest");
		}
	else{
		System.out.println("z is greatest");
		}
}
else if(x<y){
	if(x>z){
		System.out.println("x is greatest");
		}
	else{
		System.out.println("z is greatest");
		}

}
}
}
