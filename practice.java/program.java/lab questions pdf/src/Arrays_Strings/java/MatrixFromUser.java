package Arrays_Strings.java;
import java.util.Scanner;
public class MatrixFromUser {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j;
        try {
            System.out.println("enter the no of rows:");
            m = sc.nextInt();
            System.out.println("enter the no of columns");
            n = sc.nextInt();
            int first[][] = new int[m][n];
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    first[i][j] = sc.nextInt();
                }
            }
            System.out.println("printing the matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.println(first[i][j] + "");
                }
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
    }

