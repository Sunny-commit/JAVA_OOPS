package Class_and_Encapsulation.java;
class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println(name + " " + yearOfJoining + " " + address);
    }
}

 class Mains {
    public static void main(String[] args) {
        // Creating objects of Employee class
        Employee employee1 = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 55000, "26B- WallsStreet");

        // Displaying information of employees
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
