import java.util.Scanner;
class Adding_Both_equal{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter lenght of array:");
    int n=sc.nextInt();
    System.out.println("Enter "+n+" elements of array:");
    int ar[]=new int[n];
    int sum=0,Sum=0,tol=0;
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
        tol=tol+ar[i];
    }
    int c=0,flag=0;
    System.out.println("The Array");
    for(int i=0;i<n;i++){
        System.out.print(ar[i]+ " ");
    }
    System.out.println();
    System.out.println("Total sum "+tol);
    for(int i=0;i<n;i++){
        c++;
        sum=sum+ar[i];
        Sum=tol-sum;
        if(Sum==sum){
            System.out.println("equal sum is  "+sum);
            flag=1;
            break; }
    }
    if(flag==1){
        System.out.print("The indices pairs are ( ");
        for(int i=0;i<c;i++){
            System.out.print(i + " "); }
        System.out.print(" ) and ( ");
        for(int i=c;i<n;i++){
            System.out.print(i + " "); }
        System.out.println(")");  }
    else
        System.out.println("The split by equal sum is not possible");
}
}

