import java.util.Scanner;
import java.util.*;
public class Room{
	public static void main(String args[]){
		int i,j;
			int[]total=new int[10];
			int[][] girls=new int[5][5];
			int[][] boys=new int[5][4];
			Scanner sc=new Scanner(System.in);
			for(i=0;i<5;i++) {
				for(j=0;j<5;j++) {
					System.out.println("enter the room"+(i+1));
					girls[i][j]=sc.nextInt();						
			}
System.out.print("room is full,go to next room");
			}
}
}