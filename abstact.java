// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract void draw();
}

// Rectangle class inherits from Shape
class Rectangle extends Shape {
    // Implementing the abstract method from the Shape class
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Circle class inherits from Shape
class Circle extends Shape {
    // Implementing the abstract method from the Shape class
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class abstact {
    public static void main(String[] args) {
        // Creating objects of Rectangle and Circle classes
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        // Calling the draw method on both objects
        rectangle.draw();
        circle.draw();
    }
}

// abstract class Animal {
// public abstract void animalSound();

// public void sleep() {
// System.out.println("zzz");
// }
// }

// class Pig extends Animal {
// public void animalSound() {
// System.out.println("pig says:wee wee");
// }
// }

// class metod {
// public static void main(String[] args) {
// Pig myPig = new Pig();
// myPig.animalSound();
// myPig.sleep();
// }

// }

// public class metod {

// int year;
// String name;

// public metod(int year1, String name1) {
// year = year1;
// name = name1;
// }

// public static void main(String[] args) {
// metod myObj = new metod(2002, "sheetal");
// System.out.println(myObj.year + " " + myObj.name);
// }
// }
