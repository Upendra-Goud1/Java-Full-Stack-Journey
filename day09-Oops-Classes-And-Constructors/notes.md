# Day 9 — OOP Concepts in Java

## 1) OOP Basics

Java is not 100% OOP because the 8 primitive data types (byte, short, int, long, float, double, char, boolean) are not classes
To make primitives behave like objects, Java provides Wrapper Classes — every primitive has a corresponding wrapper class
Variables inside a class are also called fields

## Primitive vs Wrapper Classes:

Primitive	Wrapper Class
byte	    Byte
short	    Short
int	        Integer
long	    Long
float	    Float
double	    Double
char	    Character
boolean	    Boolean

## 2) Classes

A class is a blueprint — it defines the structure and behavior of objects
A class can have fields (variables), methods (functions), and constructors
Infinite objects can be created from a single class
Objects are created from the class blueprint, each with their own data

## 3) Constructors

A constructor is responsible for creating an object
Writing a constructor is not mandatory — JVM provides a default constructor automatically
Constructor has no return type (not even void)
Constructor name must always match the class name
Used to assign values to instance variables at the time of object creation
JVM provides a default (non-parameterized) constructor automatically
If you write a parameterized constructor, JVM stops providing the default constructor — you must write it manually
A class can have any number of constructors (based on parameters) — this is called Constructor Overloading
Only one non-parameterized constructor is allowed (since no parameters means no difference between them)

## Types of Constructors:

i) Default Constructor (non-parameterized)
ii) Parameterized Constructor

## Key Rules — Quick Reference

## Rule	                                                       Answer

Is writing a constructor mandatory?	                           No — JVM provides a default one
Does constructor have a return type?	                       No
Constructor name must match?	                               Class name exactly
How many constructors can a class have?	                       Any number (based on parameters)
How many non-parameterized constructors?	                   Only one
If I write a parameterized constructor, will JVM give default? No — you must write it manually
What does this keyword do?	                                   Refers to current object's instance variable