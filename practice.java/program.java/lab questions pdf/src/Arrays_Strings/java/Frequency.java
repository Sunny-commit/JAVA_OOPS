package Arrays_Strings.java;

public class Frequency {
    void freque() {
        String a = "my name is chandu";
        for (int i = 0; i < a.length(); i++) {
            int fre = 0;
            char y[] = a.toCharArray();
            for (int j = 0; j < y.length; j++) {
                if (y[i] == y[j]) {
                    fre++;
                }
            }
            System.out.println(y[i] + " is " + fre);
        }
    }
    void vowels(){
        String a = "my name is chandu";
        int fre = 0;
        int space=0;
        for (int i = 0; i < a.length(); i++) {
            char y[] = a.toCharArray();
                if (y[i]=='a'||y[i]=='e'||y[i]=='o'||y[i]=='i'||y[i]=='u') {
                    fre++;
                }
                else if(y[i]==' '){
                    space++;
                }
        }
        System.out.println("the no of vowles are:"+fre);
        System.out.println("the no of spaces are:"+space);
    }
    public static void main(String args[]) {
       Frequency f=new Frequency();
     //  f.freque();
       f.vowels();
    }
}
