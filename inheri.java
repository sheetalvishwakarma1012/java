// Parent class
class Animal {
    String species;

    // Constructor
    public Animal(String species) {
        this.species = species;
    }

    // Method
    public void eat() {
        System.out.println(species + " is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Constructor
    public Dog(String species) {
        super(species); // Call to parent class constructor
    }

    // Method
    public void bark() {
        System.out.println(species + " is barking");
    }
}

public class inheri {
    public static void main(String[] args) {
        // Creating an object of the child class
        Dog dog = new Dog("Dog");

        // Calling methods from both parent and child classes
        dog.eat(); // Inherited method from parent class
        dog.bark(); // Method of the child class
    }
}