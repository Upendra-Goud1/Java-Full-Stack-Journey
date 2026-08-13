# Day 13 — OOP Principles: Polymorphism

## What is Polymorphism?

Poly → Many
Morphism → Forms
Polymorphism means having the same method with multiple forms
It is one of the 4 main pillars of OOP in Java

## 2 Types of Polymorphism

## Type	           Also called	             Achieved by
Compile Time	   Static / Early Binding	 Method Overloading
Runtime	           Dynamic / Late Binding	 Method Overriding

## 1) Compile Time Polymorphism (Method Overloading)

Theory:

- > One method can have multiple forms with different parameters
- > Nothing but having a same method name with multiple forms by changing:
- > Parameter count (number of parameters)
- > Data type of parameters
- > Order of parameters
You can change the return type but it does not work alone — changing only return type is NOT considered overloading

## Rules for Method Overloading:

Change	Valid Overloading?
Change parameter count	✅ Yes
Change data type of parameters	✅ Yes
Change order of parameters	✅ Yes
Change return type only	❌ No — does not work alone