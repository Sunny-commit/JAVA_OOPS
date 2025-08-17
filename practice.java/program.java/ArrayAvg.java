import java.util.Scanner;
import java.util.*;
import java.lang.*;
class ArrayAvg{
public static void main(String args[]){
int[] a;
int n=7,count=0;
a=new int[]{1,5,3,2,7,5,9};
int i,sum=0;
for(i=0;i<n;i++){
count=count+1;
sum=sum+a[i];
}
System.out.println("the sum of array is"+sum);
int avg;
avg=sum/count;
System.out.println("average of array is"+avg);
}
}