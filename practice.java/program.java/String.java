import java.lang.*;
import java.util.*;
class Strings{
	public static void main(String args[]){
		String s1="cse";
		String s="cse";
	String s2="hello";
	int i;
		System.out.println("String constant pool checking:"+(s1==s2));
	System.out.println("String constant pool checking:"+(s==s2));
	String s3=new String("jaisriram");
	String s4=new String("jaisriram");
	System.out.println("Heap checking:"+(s3==s4));
	String s5="java programming";
	System.out.println("second character in cse:"+s.charAt(1));
	char c[]=new char[10];
	s5.getChars(5,12,c,2);
	for(i=0;i<c.length;i++){
		System.out.println("index-"+i+":"+c[i]);
		}
	}
}