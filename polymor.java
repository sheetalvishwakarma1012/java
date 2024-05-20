// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding the sound() method of the parent class
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    // Overriding the sound() method of the parent class
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class polymor {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Calling the sound() method on both objects
        dog.sound();
        cat.sound();
    }
}