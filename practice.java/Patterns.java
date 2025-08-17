import java.util.Scanner;
import java.util.*;
import java.lang.*;
class Patterns{
    public static void main(String args[]){
        int i;
        int j;
        System.out.println("Enter the size:");
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++) {
                System.out.println("*");
				System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
}