package Arrays_Strings.java;
import java.lang.String;
public class Capitalize {
    public static void main(String args[]) {
        String a = "          amafsdaf       fafjsl";
        String op = " ";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!Character.isWhitespace(ch)) {
                op += ch;
            }
        }
        System.out.println(op);
    }
}
