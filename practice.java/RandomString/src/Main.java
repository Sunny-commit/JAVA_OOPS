import java.util.Random;
import java.lang.*;
import java.util.Scanner;
class RandomString{
    public static void main(String args[]){
        String abc="abcdefghijklmnopqrstuvwxyz";
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int size;
        size=s.nextInt();
        for(int i=0;i<5;i++){
            System.out.println("the generated random char is: "+abc.charAt(r.nextInt(size)));
        }
    }
}