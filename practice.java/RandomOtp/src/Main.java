import java.lang.*;
import java.util.Random;
import java.util.Scanner;
class Otp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num,n=0;
        for(int i=0;i<10000;i++) {
            num=random.nextInt();
            if(num%2==0){
                n=num;
            }
        }
        System.out.println(n);
//        System.out.println("enter the OTP");
//        int enter;
//        enter=sc.nextInt();
//        if(enter==num){
//            System.out.println("OTP valid");
//        }
//        else{
//            System.out.println("OTP is invalid");
//        }
//    }
    }
}