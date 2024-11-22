
// Parent class
 class Animal {

    String name;
    
    // Constructor
    Animal(String name) {
        this.name = name;
    }
    
    // Method to demonstrate behavior
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    
    // Constructor to initialize Dog object
    Dog(String name) {
        super(name);  // Calls the parent class constructor
    }

    // Method overriding parent class method
    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }

    // Method to demonstrate flow control (if-else, switch, loops)
    void performTricks() {
        int trick = 2;

        // If-else example
        if (trick == 1) {
            System.out.println(name + " rolls over.");
        } else if (trick == 2) {
            System.out.println(name + " plays dead.");
        } else {
            System.out.println(name + " wags its tail.");
        }

        // Switch-case example
        switch (trick) {
            case 1:
                System.out.println(name + " is rolling over.");
                break;
            case 2:
                System.out.println(name + " is playing dead.");
                break;
            default:
                System.out.println(name + " is wagging the tail.");
        }

        // Loop example (for loop)
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " does a trick.");
        }
    }
}

// Main class with the main method
public class Main {
    public static void main(String[] args) {
        // Create Dog object (inherits from Animal)
        Dog myDog = new Dog("Buddy");

        // Call the overridden method
        myDog.makeSound();

        // Flow control demonstration inside a method
        myDog.performTricks();
    }
}
