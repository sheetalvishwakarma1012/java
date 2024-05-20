class Student {
    // Private member variables
    private String name;
    private int age;

    // Public getter and setter methods to access and modify the private variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Validation logic can be added here
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class encap {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student();

        // Setting values using public setter methods
        student.setName("Alice");
        student.setAge(20);

        // Getting values using public getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}