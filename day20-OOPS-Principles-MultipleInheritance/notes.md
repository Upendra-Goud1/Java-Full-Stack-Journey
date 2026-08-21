# Day 20 — Multiple Inheritance through Interfaces

## Multiple Inheritance

Theory:

- > One child class inherits from two or more parent classes
- > In Java, this is NOT allowed with classes — to avoid the Diamond Problem (Ambiguity Problem)
- > But Java supports Multiple Inheritance through Interfaces
- > Diamond Problem — Why Multiple Inheritance is NOT allowed with classes

## Problem: If two parent classes have methods with the same name, the compiler won't know which one to use — this creates ambiguity

   Class A          Class B
  (void m1())     (void m1())
       ↘               ↙
           Class C
     (which m1() to use? ❌)

- > Multiple inheritance is NOT supported with classes in Java
- > It IS supported through interfaces — because interfaces don't have implementation (till Java 7), so there is no ambiguity
- > How Java solves it — Multiple Inheritance through Interfaces

- > When two interfaces have a method with the same name, the implementing class provides one single implementation — so no ambiguity

## Why no Diamond Problem with Interfaces?

Interface A          Interface B
(m1() — no body)   (m1() — no body)
       ↘                ↙
           Class C
    (gives ONE m1() body — no ambiguity ✅)

- > With classes — both A and B have their own implementation of m1() → compiler confused → ❌ Diamond Problem
- > With interfaces — neither A nor B have any implementation → Class C gives one single implementation → ✅ No ambiguity

## Class C implements A and B — method count

## Method	        From	                Status
m1()	            Both A and B	        ONE implementation in C — no conflict
m2()	            Interface A only	    Must implement in C
m3()	            Interface B only	    Must implement in C