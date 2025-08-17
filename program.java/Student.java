import java.util.Scanner;
import java.util.*;
import java.lang.*;
class Student{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the student details:");
			int i;
			System.out.println("enter the no of student");
			int n;
			n=sc.nextInt();
			String y[];
			for(i=0;i<n;i++){
				System.out.print("enter the age:");
				y[i]=sc.nextInt();
				System.out.print("enter the name:");
				y[i]=sc.next();
			}
	}
}
		