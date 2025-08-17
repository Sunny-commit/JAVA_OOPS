import java.util.Scanner;
import java.lang.String;
public class NumbertoRoman {
   static String converttoRoman(int number) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(numerals[i]);
                number -= values[i];
            }
        }
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = sc.nextInt();
        if (number < 1 || number > 3900) {
           System.out.println("enter the range from 1-3900");
            return;
        }
        String romanNumber = converttoRoman(number);
        System.out.println("Roman numerals:" + romanNumber);

    }
}