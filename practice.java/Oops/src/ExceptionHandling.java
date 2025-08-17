public class ExceptionHandling {
 public static void main(String[] args) {
 //   void javalangexception(){
            try {
                System.out.println("division of two numbers:" + (10 / 0));
            } catch (ArithmeticException ie) {
               // System.out.println("error due to /zero");
              //  ie.printStackTrace();
                System.out.println("the excaprtoin is"+ie.getMessage());
            }
    }
}
//
//    class Main {
//        public static void main(String[] args) {
////        int a=4;
////        int b=0;
////        try{
////            System.out.println("the division of a and b is:"+a/b);
////        }
////        catch(ArithmeticException e){
////            System.out.println("error");
////            throw e;
////           // e.printStackTrace();
////           // e.getStackTrace();
////        }
//            //java.lang.Exception handling
//
//            ExceptionHandling obj=new ExceptionHandling();
//            obj.javalangexception();
//
//        }
//    }
//
