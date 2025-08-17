import java.util.*;
import java.lang.*;
class OtherClassWeek5{
	private String name;
	Private int age;
	Private String country;
	public String getName(){
		return name;
		}
	public void setName(String name){
		this.name=name;
		}
	public int getAge(int age){
		return age;
		}
	public void setAge(int age){
	this.age=age;
	}
	public String getCountry(){
		return country;
		}
	public void setCountry(String country){
		this.country=country;
		}
	}
public class Main{
	public static void main(String[] args){
		OtherClassWeek5 person=new OtherClassWeek5();
		person.setName("chandu");
		person.setAge(25);
		person.setCountry("USA");
		String Name=person.getName();
		String Age=person.getAge();
		String Country=person.getCountry();
		System.out.println("name:"+Name);
		System.out.println("Age:"+Age);
		System.out.println("Country:"+Country);
		}
	}