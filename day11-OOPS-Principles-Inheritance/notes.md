# Day 11 — OOP Principles: Inheritance

## OOP's 4 Principles (Pillars)

1) Inheritance
2) Polymorphism
3) Encapsulation
4) Abstraction

## These four principles are the main pillars of OOP and Java.

## 1) Inheritance


-> Inheritance means inheriting some features from the parent class to the child class
-> Parent class is also called: Super class / Base class
-> Child class is also called: Sub class / Derived class
-> How to inherit features from parent to child? → Using the extends keyword
-> Child class gets all methods and fields of the parent class
-> Promotes code reusability — write once, use in multiple child classes

## Types of Inheritance

## a) Single Level Inheritance

One parent and one child
One child is extending one parent class — that is Single Level Inheritance

## b) Multi Level Inheritance

A class derives from another class that is already derived from a base class
Chain: Class A → Class B → Class C

## c) Hierarchical Inheritance

One parent class extended by multiple child classes
All child classes share the parent's features

        parent class
             ↓
   ↙    ↙    ↓    ↘
Child1 Child2 Child3 Child4

## d) Multiple Inheritance ❌ (Not allowed with classes)

One child class inherits from two or more parent classes
NOT allowed in Java with classes — to avoid the Diamond Problem (Ambiguity Problem)
Problem: If both parent classes have a method with the same name, the compiler won't know which one to use

    A       B
     ↘     ↙
        C

## e) Hybrid Inheritance ❌ (Not allowed with classes)

A combination of two or more types of inheritance
Also NOT allowed in Java with classes
Supported through Interfaces (covered later)