//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Parent{
    int a=9;
    void display(){
        System.out.println("PARENT");
    }
}
class Child extends Parent{
    int b=10;
    int a=2;
    void show(){
    System.out.println("CHILD");
    }
}
class Gchild extends Parent{
    int d=11;
    int a=100;
    void random(){
        super.display();//-----method displaying using super keyword----
        System.out.println("hierarchcal");
        System.out.println(super.a);//super keyword using -----------
    }
        }
//class Gchild extends Child{
//    int d=11;
//    void random(){
//        System.out.println("GCHILD");
//    } -------multiple inheritance ------------example----
//
//}

 class Inherit {
     public static void main(String[] args) {
         //Gchild c = new Gchild();--multiple inheritance-----
        // System.out.println(c.d);
         Child c=new Child();
         Parent p=new Parent();

         System.out.println(c.b);
         System.out.println(c.a);
         Gchild g=new Gchild();
         System.out.println(g.d);
         System.out.println(g.a);
         System.out.println(p.a);
         c.show();
         c.display();
         g.random();
        // c.random();
     }
 }
