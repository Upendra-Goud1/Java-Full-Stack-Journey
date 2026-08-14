# Day 14 — Runtime Polymorphism and final keyword

## 1) Runtime Polymorphism (Method Overriding)

Theory:

This happens after object creation — object creation happens at runtime, so it is called Runtime Polymorphism
Late Binding → binding happens after the creation of an object
The method to call is decided at runtime by JVM based on the actual object type
Method Overriding — Full Rules

Theory:

Comes into picture only when there is inheritance
Works with parent and child relationship
You can override a parent class method in child class by giving your own implementation

Rules:

Method name must always be same
You cannot change return type
You cannot change parameters
You can change the implementation (body)
@Override annotation is not mandatory but good practice
You cannot override static methods
You cannot override final methods
You cannot override a constructor

## Important note on static methods:

When you write a static method in child class with the same name as parent class static method — it does NOT mean you are overriding. It means you are hiding the static method. This is called method hiding, not overriding.

## Important Interview Questions

## Question	                                             Answer
Can you override main method in Java?	            NO — main is a static method, static methods cannot be overridden
Do you need inheritance for Method Overloading?	    NO — overloading works in the same class
Do you need inheritance for Method Overriding?	    YES — must have parent-child relationship
Can you overload main method?	                    YES — but JVM always looks for String[] args version
Why can't static methods be overridden?	            Static methods get memory at compile time, overriding works at runtime — both can't work together
Why can't this and super be used in static methods?	this and super are object references — static does not work with objects

## Can you overload main?

public class MainOverload {

    // JVM always calls this one
    public static void main(String[] args) {
        System.out.println("main with String[] args");
        main(5); // calling overloaded main
    }

    // valid overload — but JVM won't call this directly
    public static void main(int[] args) {
        System.out.println("main with int[] args");
    }
}

Note: You can overload main, but JVM will not call the overloaded version — it always looks for public static void main(String[] args) as the entry point.

## 2) final keyword

Theory:
final keyword can be applied to three things — variables, methods, and classes. Each behaves differently.

## i) final Variables
When you declare a final variable, you cannot change its value
You cannot declare a final variable without initializing it
Acts like a constant

## ii) final Methods
When you mark a method as final, you cannot override it in child class
You can overload a final method
Use final methods when you want to prevent child classes from changing the implementation

public class Car {

    final void drive() {
        System.out.println("Car is driving...");
    }

    // final method can be overloaded
    final void drive(int speed) {
        System.out.println("Car is driving at " + speed + " km/h");
    }
}

public class FuelCar extends Car {

    // @Override
    // void drive() { } // ERROR — cannot override final method

    // Overloading is allowed
    void drive(String mode) {
        System.out.println("FuelCar driving in " + mode + " mode");
    }
}

## iii) final Class
When you mark a class as final, you cannot inherit it (cannot extend it)
No child class can be created from a final class
Example: String class in Java is a final class

final class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

// public class Car extends Vehicle { } // ERROR — cannot inherit final class