package Inheritance.java;

public class Inheritance {
}
class student{
    int id;
    String name;
    int batch;
    String branch;
    student(int id,String name,int batch,String branch){
        this.id=id;
        this.name=name;
        this.batch=batch;
        this.branch=branch;
    }
}
class mystudent extends student{
    mystudent(int id,String name,int b,String bra){
        super(id,name,b,bra);
    }
    void display(){
        System.out.println("displaying the data:");
        System.out.println("id:"+id+"name:"+name+"batch"+batch+"branch"+branch);
    }
}
class display{
    public static void main(String args[]){
        mystudent m=new mystudent(1,"chandu",2021,"CSE");
        m.display();
    }
}



