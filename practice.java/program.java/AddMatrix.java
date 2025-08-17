import java.util.Scanner;
import java.lang.*;
import java.util.*;
class AddMatrix{
public static void main(String args[]){
int rows=2,column=3;
int i,j;
int[][] first={{2,3,4},{5,8,9}};
int[][] second={{1,5,3},{4,6,8}};
System.out.println("the first matrix is:");
for(i=0;i<rows;i++){
for(j=0;j<column;j++){
System.out.print(first[i][j]);
}
System.out.println();}
System.out.println("the second matrix is:");
for(i=0;i<rows;i++){
for(j=0;j<column;j++){
System.out.print(second[i][j]);
}
System.out.println();
}
int[][]sum=new int[rows][column];
for(i=0;i<rows;i++){
for(j=0;j<column;j++){
sum[i][j]=first[i][j]+second[i][j];
}
}
System.out.println("displaying the data:");
for(i=0;i<rows;i++){
for(j=0;j<column;j++){
System.out.print(sum[i][j]);
}
System.out.println();
}
}
}