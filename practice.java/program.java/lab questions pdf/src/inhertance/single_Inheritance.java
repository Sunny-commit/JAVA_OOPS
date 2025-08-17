package inhertance;
//single inheritance example
 class Animal {
    int legs;
    int tail;
    Animal(int legs,int tail){
        this.legs=legs;
        this.tail=tail;
    }
    void Eat(){
        System.out.println("it eats all things");
    }
}
class Dog extends Animal{
    Dog(int legs,int tail){
        super(legs,tail);
    }
    void Bark(){
        System.out.println("the dog barks");
    }

}
class SingleInheritance{
    public static void main(String args[]){
        Dog dog=new Dog(4,1);
        System.out.println("the no of legs"+dog.legs);
        dog.Bark();
        dog.Eat();
    }
}
