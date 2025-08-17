package Arrays_Strings.java;
import java.util.Scanner;
public class Sum_ave_10 {
    public static void main(String args[]) {
        int a[] = new int[10];
        try {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("printing the numbers");
            for (int i = 0; i < 10; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            int sum = 0;
            int average = 0;
            System.out.println("sum of the  10 numbers");
            for (int i = 0; i < 10; i++) {
                sum += a[i];
            }
            System.out.println("the totoal is" + sum);
            average = sum / 10;
            System.out.println("average is" + average);
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
    }
}
