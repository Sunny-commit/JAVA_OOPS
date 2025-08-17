import java.util.Scanner;

public class question {
    void q1(){
        int a=2;
        int b=3;
        System.out.println("the area of the rectangle of a and b are "+(a*b));
    }
    void q2(){
        char a='h';
        Scanner sc=new Scanner(System.in);
        int b=(int) a;
        System.out.println("the Ascii value of "+a+"is "+b);
    }
    void q3(){
        Scanner sc=new Scanner(System.in);
        char a='d';
        int b=(int) a;
        int c=b+3;
        System.out.println("the ascii value of"+a+"is"+b);
        System.out.println("the ascii value of"+a+"3 add is"+c);
        char d=(char) c;
        System.out.println("the 3 add ascii vlaue is:"+d);
    }
    void q4(){
        Scanner sc=new Scanner(System.in);
        double a=3.9;
        System.out.println("the square of a is "+3.9*3.9);
    }
    void q5(){
        int a=2;
        int b=3;
        int c=5;

    }
    void q7(){
        int a=6;
        int b=8;
        int temp;
        System.out.println("brfore swaping a"+a+"b"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping a"+a+"b"+b);
        System.out.println("without third variable");
        a=a+b;
        b=a-b;
    }
    void q8(){

       int a[]=new int[]{1,2,3,4,5};
    int size=a.length;
       int temp;
       for(int i=0;i<size;i++){
           for(int j=i+1;j<size;j++){
               if(a[i]>a[j]){
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       int b,c,sum=0;
       for(int i=0;i<size;i++){
           System.out.println(a[i]+" ");
           if(i==0 || i==((a.length)-1)){
               sum=sum+a[i];
               System.out.println("sum is"+sum);
           }
       }
        System.out.println("sum is"+sum);
    }
    void q9(){
        int a[]=new int[]{5,6,9,6};
        for(int i=0;i<a.length;i++){
            while(i!=a.length){
                a[i] += 2;
                a[i]=a[i]%10;
                i++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    void q10(){
        int a=132;
        int rem,n=0;
      for(int i=132;i!=0;i--){
          rem=a%10;
          n=n*10+rem;
      }
        System.out.println("the reverser number is:"+n);
    }

}
class M{
    public static void main(String args[]){
        question q=new question();
        //q.q1();
       // q.q2();
       // q.q3();
       // q.q4();
       // q.q7();
        //q.q8();
        //q.q9();
        q.q10();
    }
}
