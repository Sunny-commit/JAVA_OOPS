import java.lang.*;
class Otp{
public static void main(String args[]){
	random r=new Random();
	int i=r.nextInt(10000);
	if(i<1000){
		System.out.println(1000+i);
	}
	else{
		System.out.println(i);
	}
}
}
