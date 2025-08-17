package object_class.java;

public class Assign {
}
class student{
    String name;
    String id_no;
    student(String name,String id_no){
        this.name=name;
        this.id_no=id_no;
    }
    void display(){
        System.out.println("name"+name+"id_no"+id_no);
    }
    public static void main(String args[]){
        student s=new student("chandu","234");
        s.display();
    }

}
