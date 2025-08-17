public class Week4{

        void Q3(){
        String str = "chandu";
        String substring = "du";
        if (str.endsWith(substring)) {
            System.out.println("is a substring");
        } else {
            System.out.println("is not a Substing");
        }
    }
    void Q4(){
            String str="chandu";
            int size=str.length();
            char y[]=str.toCharArray();
            for(int i=0;i<size;i++){
                System.out.println(y[i]);
            }
    }
//    void Q9(){
//        String str=new String("chandu is a good boy");
//            char y[]=str.toCharArray();
//            int size=str.length();
//            int count=0;
//            int count1=0;
//            for(int i=0;i<size;i++){
//                for(int j=1;j<size;j++){
//                    if(y[i]==y[j]){
//                        count++;
//                    }
//                    else{
//                        count1++;
//                    }
//                }
//            }
//            System.out.println("the unequal characters are:"+count);
//        System.out.println("the unequal characters are:"+count1);
//
//
//    }
    void Q11(){
            String str="chandu is a good boy";
            str=str.trim();
        System.out.println(str);
            char y[]=str.toCharArray();
            int size=str.length();
            int flag=0;
            char k[]=new char[size];
            int count=0;
            for(int i=0;i<size;i++){
                for(int j=1;j<size;j++) {
                    if (y[i] != y[j]) {
                        k[i] = y[i];
                        break;
                    }
//                    else{
//                        count++;
//                        flag=0;
//                    }
//                }
//            }
//            if(flag==1){
//                System.out.println("the first non-repeated character is:"+k);
//            }
//            else{
//                System.out.println("the repeated characters are:"+count);
                }
            }
        System.out.println("the first non-repeated charatcer is:"+k[0]);
    }
    void Q12(){
            String str="abcdefghijklmnopqrstuvwxyz";
            int len=5;
            char y[]=str.toCharArray();
            char z[]=new char[str.length()];
            int size=str.length();
            int part=size/len;
            int k=0;
            for(int i=0;i<size;i++) {
                if (i % part == 0) {
                    z[k++]=y[i];
                    System.out.println(z[i]);
                }
                else{
                    z[k++]=y[i];
                    System.out.println(z[i]);
                }
            }
            for(int i=0;i<size;i++){
                break;
            }
    }
    void Q13(){
            String str="anaasdjffjffas";
            char y[]=str.toCharArray();
            int size=str.length();
            int flag=0;
            char z[]=new char[str.length()];
            for(int i=0;i<size;i++){
                for(int j=1;j<size;j++){
                    if(y[i]==y[j]){
                        flag=1;
                    }
                    else{
                      //  if(flag==1){
                        //    break;
                        }
                    }
                }
            }
           // if(flag==1){
///
          //  }
    void Q7(){
            String str="the quick brown fox jumps over the lazy dog.";
            int a=str.indexOf("a",0);
        int b=str.indexOf("b",0);
        int c=str.indexOf("c",0);
        int d=str.indexOf("d",0);
        int e=str.indexOf("e",0);
        int f=str.indexOf("f",0);
        int g=str.indexOf("g",0);
        int h=str.indexOf("h",0);
        int i=str.indexOf("i",0);
        System.out.println("a b c d e f g h i ");
        System.out.println("====================");
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+"\n");
    }


}
class A{
    public static void main(String[] args){
        Week4 obj=new Week4();
        //obj.Q3();
        //obj.Q4();
        //obj.Q11();
        obj.Q12();
        //obj.Q7();
    }
}