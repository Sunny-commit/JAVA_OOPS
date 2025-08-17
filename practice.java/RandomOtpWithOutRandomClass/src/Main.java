import java.lang.*;
import java.util.Random;
import java.util.Scanner;
class Otp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int num=(int)Math.random()*10;
        System.out.println("the generated otp is:");
        System.out.println(num);
//        for(i=0;i<1000;i++){
//            System.out.println("the genetated otp is:"+);
//        }

        System.out.println("enter the OTP");
        double enter;
        enter=sc.nextInt();
        if(enter==num){
            System.out.println("OTP valid");
        }
        else{
            System.out.println("OTP is invalid");
        }
    }
}