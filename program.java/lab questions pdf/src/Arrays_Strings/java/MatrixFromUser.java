package Arrays_Strings.java;
import java.nio.file.FileAlreadyExistsException;
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
            int second[][]=new int[m][n];
           int third[][]= new int[m][n];
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
            System.out.println("enter the second matrix is:");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    second[i][j]=sc.nextInt();
                }
            }
            System.out.println("printing the second matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.println(first[i][j] + "");
                }
                System.out.println();
            }
            System.out.println("matix sum:");
            for(i=0;i<m;i++){
                for(j=0;i<n;j++){
                    third[i][j]=first[i][j]+second[i][j];
                }
            }
            System.out.println("printing the matrix sum:");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.println(third[i][j] + "");
                }
                System.out.println();
            }


        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    }

