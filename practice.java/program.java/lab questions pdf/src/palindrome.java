
public class palindrome {
    public static void main(String args[]){
        int x=897;
        int b=x;
        int a=0;
        int rem=0;
        while(x!=0){
            a=x%10;
            rem=rem*10+a;
            x=x/10;
        }
        if(rem==b){
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("is not a palindrome");
        }
    }
}
