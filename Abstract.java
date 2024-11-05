// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    public abstract void sound();

    // Concrete method (with implementation)
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Concrete subclass Dog that extends Animal
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Concrete subclass Cat that extends Animal
class Cat extends Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the abstract class and its subclasses
public class AbstractExample {
    public static void main(String[] args) {
        // Create a Dog object and call its methods
        Animal dog = new Dog();
        dog.sound();    // Output: The dog barks.
        dog.sleep();    // Output: The animal is sleeping.

        // Create a Cat object and call its methods
        Animal cat = new Cat();
        cat.sound();    // Output: The cat meows.
        cat.sleep();    // Output: The animal is sleeping.
    }
}
