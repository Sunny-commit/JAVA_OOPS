package object_class.java;

public class Students {

        int id;
        String name;
        int room;
       char Grade;
        Students(int id,String name,int room,char Grade){
        this.id=id;
        this.name=name;
        this.room=room;
        this.Grade=Grade;
        }
        void Details(){
            System.out.println("name:"+name+"room"+room+"id"+id+"Grade"+Grade);
        }
        void print(){
            System.out.println("student details");
            System.out.println("name:"+name);
            System.out.println("room:"+room);
            System.out.println("id:"+id);
            System.out.println("Grade:"+Grade);
        }
        public static void main(String args[]){
            Students s=new Students(12,"chandu",7,'A');
            s.print();
            s.Details();
        }
}

