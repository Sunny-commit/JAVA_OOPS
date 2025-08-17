import java.util.Scanner;
import java.util.*;
import java.lang.*;
class Practice{
class SingleArr{
int[]a=new int[5];
int k;
Scanner sc=new Scanner(System.in);
for(k=0;k<5;k++){
System.out.println("enter"+(k+1)+"value:");
a[k]=sc.nextInt();
}
}
class MultiDim{
int r,c;
System.out.println("enter sizeof rows");
r=sc.nextInt();
System.out.println("enter sizeof columns");
c=sc.nextInt();
int i,j;
int[][]arr=new int[r][c];
for(i=0;i<r;i++){
for(j=0;j<c;j++){
System.out.println("enter the value of["+i+j+"]");
arr[i][j]=sc.nextInt();
}
}
}
public static void main(String args[]){
Practice obj1=new Practice();
Practice.SingleArr obj2=obj1.new SingleArr();

Practice.MultiDim obj3=obj1.new SingleArr();

}
} 

