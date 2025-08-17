3. Write a program to implement Multilevel Inheritance with example( Base classAnimal, Derived Class – Dog , Derived Class- Babydog) and display the details of (Animal,
Dog, Babydog) 
-----------------------------------------------------------------------------------
// Base class
class Animal {
    String type;
    int age;

    // Constructor
    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    // Method to display details of the animal
    void displayAnimalDetails() {
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
    }
}

// Derived class from Animal
class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String type, int age, String breed) {
        super(type, age);
        this.breed = breed;
    }

    // Method to display details of the dog
    void displayDogDetails() {
        displayAnimalDetails();
        System.out.println("Breed: " + breed);
    }
}

// Derived class from Dog
class BabyDog extends Dog {
    String color;

    // Constructor
    public BabyDog(String type, int age, String breed, String color) {
        super(type, age, breed);
        this.color = color;
    }

    // Method to display details of the baby dog
    void displayBabyDogDetails() {
        displayDogDetails();
        System.out.println("Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of each class
        Animal animal = new Animal("Mammal", 5);
        Dog dog = new Dog("Dog", 3, "Labrador");
        BabyDog babyDog = new BabyDog("Dog", 1, "Pug", "White");

        // Displaying details of each object
        System.out.println("Animal Details:");
        animal.displayAnimalDetails();
        System.out.println();

        System.out.println("Dog Details:");
        dog.displayDogDetails();
        System.out.println();

        System.out.println("BabyDog Details:");
        babyDog.displayBabyDogDetails();
    }
}

