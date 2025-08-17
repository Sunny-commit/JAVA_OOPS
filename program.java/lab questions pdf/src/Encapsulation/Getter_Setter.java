package Encapsulation;

public class Getter_Setter {
}
class Person {
    private String name;
    private int age;
    private String occupation;

    public Person() {
        name = "Sarah";
        age = 37;
        occupation = "VP Sales";
    }

    public String getName() {

        return name;
    }

    public void setName(String newName) {

        name = newName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation(String newOccupation)
    {
        occupation = newOccupation;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + ".");
    }

    public void sayAge() {
        System.out.println("I am " + age + " years old."+occupation);
    }
}

//add class definitions below this line



//add class definitions above this line

class Super {
    public static void main(String[] args) {
        Person p=new Person();
        p.sayHello();
        p.sayAge();
//        p.setOccupation("Farmer");
        System.out.println(p.getOccupation());
        //add code  this line



        //add code above this line
    }
}
