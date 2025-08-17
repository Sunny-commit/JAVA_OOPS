import org.w3c.dom.ls.LSOutput;

public class Animal {
    void makesound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void makesound(){
        System.out.println("dog barks");
    }
}
class SingleInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        Animal a=new Animal();
        a.makesound();
        d.makesound();
    }
}
