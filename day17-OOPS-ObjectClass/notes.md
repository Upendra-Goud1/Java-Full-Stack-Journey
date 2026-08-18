# Day 17 — OOP Object Class

## 1) Object Class (Important concept)

Theory:

- > In Java, every class has a parent class called Object
- > What is the parent class of all classes in Java? → Object is the parent of all classes in Java
- > Every class by default has a parent class called Object class — this Object class methods we will be able to use in our classes
- > Object class comes from java.lang package
- > This is why you can call methods like toString(), hashCode(), equals() on any Java object — they are inherited from the Object class

## How to see Object class in Eclipse:

- > Press Ctrl + Shift + T → type Object → select Object class and open
- > You will see all the methods Object class provides

## Object Class — 8 Methods

- > Every class in Java inherits these 8 methods from the Object class (java.lang package):

## i) equals() method

Theory:

- > Used to compare two objects
- > By default, equals() from Object class compares memory addresses (same as ==)
- > We override equals() to compare the actual content of objects
- > obj1.equals(obj2) — compares obj1 with obj2

## Why override equals()?

- > Default equals() → compares memory addresses (reference comparison)
- > Overridden equals() → compares actual field values (content comparison)

## 2. What is hashCode()?

- > hashCode() is a method provided by the Object class.

- > Every Java object has a hash code, which is an integer value used by hash-based collections such as:

HashMap
HashSet
Hashtable

##  hashCode() and equals() Contract

- > There is an important contract between equals() and hashCode().

## Rule 1 — Equal objects MUST have the same hash code

If:
obj1.equals(obj2)
returns true, then:
obj1.hashCode() == obj2.hashCode()
must also be true

## Rule 2 — Same hash code does NOT mean objects are equal

Two different objects can have the same hash code.

##  Hash Collision

- > When two different objects have the same hash code, it is called a:

## Hash Collision

        Object A
           │
           ▼
      hashCode = 100
           ▲
           │
      hashCode = 100
           │
        Object B

          ↓

     Hash Collision

## Overriding hashCode()

- > If you override equals(), you should also override hashCode().

Example:

class Person {

    String name;
    int age;

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

