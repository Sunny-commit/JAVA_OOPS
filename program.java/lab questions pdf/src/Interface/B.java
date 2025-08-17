package Interface;

abstract class Bank{
    abstract void Name();
}
class A extends Bank{
    String name;
    A(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
    public void Name(){
        System.out.println("abstract class:");
    }

}
public class B{
    public static void main(String args[]){
        A a=new A("chandu");
        a.Name();
    }
}
