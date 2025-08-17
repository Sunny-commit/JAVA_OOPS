package Arrays_Strings.java;
public class Vowels_consonant {
    public static void main(String args[]) {
        String s = new String("my name is chandu");
        int size = s.length();
        int count = 0;
        char e=0;
        int count1 = 0;
        for (int i = 0; i < size; i++) {
            e = s.charAt(i);
            if (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u') {
                count++;
            } else {
                count1++;
            }
        }
        System.out.println("the no of vowels"+count);
        System.out.println("the no of consonent"+count1);

    }
}
