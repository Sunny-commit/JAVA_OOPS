import java.lang.*;
import java.util.*;
class Parent{
	int a;
	void dispaly(){
		System.out.println("PARENT");
		}
	}
	class Child extends Parent{
		int b=10;
		void show(){
			System.out.println("child");
			}
		}
		class inherit{
			public static void main(String args[]){
				Child c=new Child();
				System.out.println(c.b);
				c.show();
				System.out.println(c.a);
				c.display();
				}
			}
//-------------------------------------------------------
class A{
int a =20;
void display(){
		System.out.println("a");
}
class B extends A{
	int b=30;
	void show(){
			System.out.println("B");
	}
}
class C extends B{
	int c=50;
	void disc(){
		System.out.println("c");
	}
}
class Multilevel{
	public static void main(String args[]){
		c obj=new c();
		obj.disc();
		obj.show();
		obj.display();
	}
}