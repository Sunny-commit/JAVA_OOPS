import java.lang.*;
import java.util.Scanner;
class A {
    String name;
    int id;
    int age;

    A[] student=new A[100];
    void insertion() {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        for (int i = 0; i < size; i++) {
            student[i]=new A();
            System.out.println("enter the student name:");
            student[i].name = sc.next();
            System.out.println("enter the student id:");
            student[i].id = sc.nextInt();
            System.out.println("enter the age:");
            student[i].age = sc.nextInt();
        }

    }
    void out(){
        int i;
        int size=3;
        for(i=0;i<size;i++){
            System.out.println("name  "+student[i].name);
            System.out.println("age   "+student[i].age);
            System.out.println("id    "+student[i].id);
        }
    }
    void sort(){

        int size=3;
        int i;
        int j;
        A temp=new A();
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                if(student[i].age>student[j].age||student[i].age==student[j].age&&student[i].name.compareTo(student[j].name)>0){
                    temp=student[j];
                    student[j]=student[i];
                    student[i]=temp;
                }
            }
        }
    }





public static void main(String args[]) {
    A obj=new A();
    obj.insertion();
    System.out.println("output list is -----------------");
    obj.sort();
    obj.out();
}
}