package Interface;

import org.w3c.dom.ls.LSOutput;

interface Interface1{
    void method1();
}
interface Interface2 {
    void method2();
}
class Myclass implements Interface1,Interface2{
   public static void method1(){
    System.out.println("interface method printing:");
}
public static void method2() {
    System.out.println("interface2 method2 printing");
}
}

    public static void main(String args[]){
        Myclass.method1();
        Myclass.method2();

    }
    }