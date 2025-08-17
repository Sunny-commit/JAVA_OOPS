package Class_and_Encapsulation.java;

public class Triangle {
    void area(int height,int base){
        int a=(1/2)*height*base;
        System.out.println(a);
    }
    void perimeter(int a,int b,int c){
        int d=a*b+b*c+c*a;
        System.out.println(d);
    }
}
class main{
    public static void main(String args[]){
        Triangle t=new Triangle();
        t.area(5,2);
        t.perimeter(2,3,6);
    }
}
