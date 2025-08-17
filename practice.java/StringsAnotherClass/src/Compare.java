import java.util.Scanner;
public class Compare {
    //lexicographically
    void com() {
        StringBuffer A=new StringBuffer("chandu was a good boy");
        StringBuffer B=new StringBuffer("CHANDU WAS A GOOD BOY");
        Scanner sc = new Scanner(System.in);
        String c=A.toString();
        String d=B.toString();
        String C=c.trim();
        String D=d.trim();
        String e=C.toUpperCase();
        String f=D.toUpperCase();

        System.out.println(e);
        System.out.println(f);

////        StringBuffer A=new StringBuffer("chandu");
////        StringBuffer B=new StringBuffer("CHANDU");
//        int size=A.length();
//        if(A.length()==B.length(){
//            for(int i=0;i<A.length();i++){
//                    if(A.charAt(i)==B.charAt(i)){
//
//
//                    }
//
//                }
//
//
//        }
        int flag=0;
        if(c.length()==d.length()){
            for(int i=0;i<e.length();i++){
                if(e.charAt(i)==f.charAt(i)){
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.println("the two strings are lexicographically");
        }
        else{
            System.out.println("the two strings are not lexicographically");
        }

    }
    void q2(){
        String A="chandu";
        String B="ad";
        char y[]=A.toCharArray();
        int sa=A.length();
        char z[]=B.toCharArray();
        int sb=B.length();
        int flag=0;
        int j,i;
        int k=0;
        for(i=0;i<(sa-sb);i++) {
            for (j = 1; j < sb; j++) {
                if (y[i + j] != z[j]) {
                    break;
                }
            }
            if (j == B.length()) {
                flag = 1;
                k=i;
            }
        }

        if(flag==1){
            System.out.println("is a substring at"+k);
        }
        else{
            System.out.println("is not a substring");
        }
    }
    void q5(){

    }
}
class M{
    public static void main(String[] args){
        Compare obj=new Compare();
       // obj.com();
        obj.q2();

    }
}

