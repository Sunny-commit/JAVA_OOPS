# ☕ JAVA OOPS - Object-Oriented Programming

A **comprehensive guide to Object-Oriented Programming** using Java with design patterns, inheritance, polymorphism, encapsulation, and best practices.

## 🎯 Overview

This project provides:
- ✅ Classes & objects
- ✅ Inheritance & polymorphism
- ✅ Encapsulation & abstraction
- ✅ Interfaces & abstract classes
- ✅ Design patterns
- ✅ Error handling
- ✅ Collections framework

## 📦 Classes & Objects

```java
public class Student {
    // Encapsulation: private fields
    private String name;
    private int age;
    private double gpa;
    private String studentId;
    
    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = 0.0;
    }
    
    // Getters & Setters (Encapsulation)
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA");
        }
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("ID: " + studentId);
    }
    
    public String getGradeFromGpa() {
        if (gpa >= 3.5) return "A";
        else if (gpa >= 3.0) return "B";
        else if (gpa >= 2.0) return "C";
        else return "D";
    }
}
```

## 🏗️ Inheritance

```java
// Base class
public abstract class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public abstract void displayRoleInfo();
    
    public void displayPersonalInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheriting classes
public class Teacher extends Person {
    private String subject;
    private double salary;
    
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }
    
    @Override
    public void displayRoleInfo() {
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + salary);
    }
    
    public void gradeStudent(Student student, double marks) {
        double gradePoint = (marks / 100) * 4.0;
        student.setGpa(gradePoint);
        System.out.println("Graded: " + student.getName());
    }
}

public class StudentClass extends Person {
    private String major;
    private double gpa;
    
    public StudentClass(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
    
    @Override
    public void displayRoleInfo() {
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}

// Usage
Person teacher = new Teacher("Mr. Smith", 40, "Mathematics", 50000);
Person student = new StudentClass("Alice", 20, "Computer Science");

teacher.displayRoleInfo();
student.displayRoleInfo();
```

## 🔄 Polymorphism

```java
// Interface for polymorphic behavior
public interface Shape {
    double calculateArea();
    double calculatePerimeter();
    String getShapeType();
}

public class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String getShapeType() {
        return "Circle";
    }
}

public class Rectangle implements Shape {
    private double length, width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public String getShapeType() {
        return "Rectangle";
    }
}

// Polymorphic usage
public class GeometryCalculator {
    public static void printShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.getShapeType());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
    
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        
        for (Shape shape : shapes) {
            printShapeInfo(shape);  // Polymorphic call
        }
    }
}
```

## 🎨 Design Patterns

```java
// Singleton Pattern
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionString;
    
    private DatabaseConnection() {
        this.connectionString = "jdbc:mysql://localhost:3306/db";
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public String connect() {
        return "Connected to: " + connectionString;
    }
}

// Factory Pattern
public class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch(type.toLowerCase()) {
            case "dog":
                return new Dog("Dog");
            case "cat":
                return new Cat("Cat");
            case "bird":
                return new Bird("Bird");
            default:
                throw new IllegalArgumentException("Unknown animal type");
        }
    }
}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Observer Pattern
import java.util.*;

public interface Observer {
    void update(String notification);
}

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
    
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("State changed to: " + state);
        }
    }
}

public class EmailNotifier implements Observer {
    private String name;
    
    public EmailNotifier(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String notification) {
        System.out.println(name + " received email: " + notification);
    }
}
```

## 🛡️ Error Handling

```java
public class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive");
        }
        
        if (amount > balance) {
            throw new InvalidAmountException("Insufficient balance");
        }
        
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }
    
    public double getBalance() {
        return balance;
    }
}

// Custom Exception
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
    
    public InvalidAmountException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Usage with try-catch
public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        
        try {
            account.withdraw(500);
            account.withdraw(600);  // Will throw exception
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Final balance: $" + account.getBalance());
        }
    }
}
```

## 📚 Collections Framework

```java
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List - ordered collection
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Set - unique elements
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);  // Duplicate ignored
        
        // Map - key-value pairs
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 87);
        studentGrades.put("Charlie", 92);
        
        // Iteration
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Stream API
        fruits.stream()
            .filter(f -> f.length() > 5)
            .forEach(System.out::println);
        
        // Map operations
        studentGrades.entrySet().stream()
            .filter(e -> e.getValue() > 90)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
```

## 💡 Interview Talking Points

**Q: Inheritance vs Composition?**
```
Answer:
- Inheritance: "is-a" relationship
- Composition: "has-a" relationship
- Composition more flexible
- Avoid deep inheritance hierarchies
- Prefer composition over inheritance
```

**Q: Abstract class vs Interface?**
```
Answer:
- Abstract class: Share code, state
- Interface: Define contracts
- Class extends abstract class
- Class implements interface
- Java 8+: Interfaces can have default methods
```

## 🌟 Portfolio Value

✅ OOP fundamentals
✅ Design patterns
✅ Inheritance & polymorphism
✅ Collections framework
✅ Exception handling
✅ Java best practices
✅ Software architecture

---

**Technologies**: Java, OOP, Design Patterns

