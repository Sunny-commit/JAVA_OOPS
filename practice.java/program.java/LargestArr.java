import java.util.Scanner;
import java.lang.*;
import java.util.*;
class LargestArr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,j,x,n;
System.out.println("enter the size of array:");
n=sc.nextInt();
int a[];
a=new int[n];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
System.out.println("the array data is"+a[i]);
}
for(i=0;i<n;i++){
for(j=0;j<i;j++){
if(a[j]>a[i]){
x=a[j];
a[j]=a[i];
a[i]=x;
}
}
}
System.out.println("the largest data is "+a[i]);
}
}