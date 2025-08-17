import java.util.Scanner;
import java.lang.*;
class Fibonnaci{
public static void main(String a[]){
int n=10,firstTerm=0,secondTerm=1,i;
System.out.println("fibonnaci series till"+n+"terms:");
for(i=0;i<n;i++){
System.out.print(firstTerm+",");
int nextTerm=firstTerm+secondTerm;
firstTerm=secondTerm;
secondTerm=nextTerm;
}
}
}