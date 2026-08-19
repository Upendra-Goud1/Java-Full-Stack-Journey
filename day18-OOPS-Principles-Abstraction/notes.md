# Day 18 — Abstraction and Abstract Class

## 4) Abstraction (4th OOP Principle)

Theory:

- > Abstraction means hiding the actual implementation
- > Show only what is necessary, hide how it works
- > Real-life example: when you press the brake in a car, you know it stops — you don't know the  internal mechanism. That is abstraction.

## Abstract Method

Theory:

- > An abstract method is a method which does not have any implementation — only has the abstract keyword
- > abstract keyword is mandatory for creating an abstract method
- > Normal methods (with body) are called concrete methods
- > Abstract methods can exist only inside an abstract class
- > Child class must give implementation of the abstract method
- > Is it mandatory to implement all abstract methods? → YES

java
abstract void drive(); // abstract method — no body, no curly braces
void start() { }       // concrete method — has a body

## Abstract Class

Theory:

- > Abstract classes are classes which have both abstract methods and concrete methods
- > Abstract classes can exist without an abstract method (but then why make it abstract? — to prevent object creation)
- > We cannot create an object of an abstract class
- > Can you write a constructor in abstract class? → YES — but you cannot create an object directly
- > Abstract methods cannot be static
- > Abstract methods cannot be final — because we cannot override final methods, and abstract methods must be overridden by child class

## Key Rules — Quick Reference

## Rule	                                             Answer
Can abstract class have constructor?	             YES
Can we create object of abstract class?	             NO
Can abstract method be static?	                     NO
Can abstract method be final?	                     NO — final can't be overridden, abstract must be overridden
Can abstract class exist without abstract method?	 YES
Must child class implement all abstract methods?	 YES
Where can abstract methods exist?	                 Only inside abstract class
What are concrete methods?	                         Normal methods with body/implementation

