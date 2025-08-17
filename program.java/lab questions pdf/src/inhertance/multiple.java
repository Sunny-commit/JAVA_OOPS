package inhertance;

interface Father{
    void displayfather();
void hello();
}
interface mother{
    void displaymother();
}
class child implements Father,mother{
    String name;
    int age;
    child(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displaychild(){
        System.out.println("child details:");
        System.out.println("name"+name);
        System.out.println("age"+age);
    }
    public void hello(){
        System.out.println("hello");
    }
   public void displaymother(){
        System.out.println("mother details:");
    }
    public void displayfather(){
        System.out.println("father details");
    }
}
