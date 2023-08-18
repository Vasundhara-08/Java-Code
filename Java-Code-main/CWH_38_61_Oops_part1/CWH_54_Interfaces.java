package CWH_38_61_Oops_part1;

// Multiple Interface
// 1st interface
interface Vehicle {
    int b =8;
    // Abstract methods with no implementation
    void start();
    void accelerate(double speed);
    void stop();
}

// 2nd interface
interface HornVehicle{
    void blow();
    void silent();
}

// Concrete classes implementing the interface
class Car implements Vehicle,HornVehicle {

    public void start() {
        System.out.println("Car started");
    }

    public void accelerate(double speed) {
        System.out.println("Car accelerated to " + speed + " mph");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void blow(){
        System.out.println("Song");
    }

    public void silent(){
        System.out.println("dont keep it silent");
    }
}

class Bicycle implements Vehicle {
    /* Important */
    // 1. every method that are defined in parent needs to be implemented in class
    // 2. when you implement method of interface you need to create them as public

    public void noise(){
        System.out.println("Peep");
    }
    public void start() {
        System.out.println("Bicycle started");
    }

    public void accelerate(double speed) {
        System.out.println("Bicycle accelerated to " + speed + " mph");
    }

    public void stop() {
        System.out.println("Bicycle stopped");
    }
}

public class CWH_54_Interfaces {
    public static void main(String[] args) {
        // Interface in english is a point where two systems meet and interact with each other
        // 1. Interafce in java is a group of related methods and with empty bodies
        // 2. In inferface class every methods are abstract
        // 3. we cannot make object of interface class but we can create its refrence
        // 4. you need to make method body after using implement syntax in child class

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.start();
        car.accelerate(60);
        car.stop();
        car.blow();

        bicycle.start();
        bicycle.accelerate(15);
        bicycle.stop();

        // you can create properties in interfaces
        System.out.println(car.b);
        // you cannot modify values in interface as they are already final
//        car.b =65;
//        System.out.println(car.b);

    }
}

/* Difference btw abstract class and interface

* 1. Methods: Abstract classes can have both abstract (methods without implementation)
*    and concrete methods (methods with implementation) whereas Interfaces only have abstract methods
*    (methods without implementation) and constants (public static final fields).
*
* 2. Inheritance: A class can extend only one abstract class, due to Java's single inheritance restriction.
*    A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
*
* 3. Constructor: Abstract classes can have constructors that are called when a subclass object is created.
     Interfaces cannot have constructors, as they are not meant to be instantiated on their own.

  4. Purpose: Abstract classes serve as a blueprint for creating subclasses. They are used when you want to
     provide a common base class with some default behavior and properties that can be shared among multiple
     subclasses whereas Interfaces provide a contract that specifies a set of methods that must be implemented
     by any class that implements the interface. They define a way to achieve multiple inheritance in Java.  */

