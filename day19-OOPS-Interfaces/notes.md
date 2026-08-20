# Day 19 — Interfaces in Java

## What is an Interface?

Theory:

- > Interfaces have 100% abstraction — till Java 7
- > Interface is nothing but same as a class in Java (but with key differences)
- > All methods are by default abstract in interfaces — till Java 7
- > In interfaces, the abstract keyword is not mandatory to write
- > All variables in interfaces are by default public static final
- > Can you create a constructor for an interface? → NO
- > Can you create an object for an interface? → NO

##    Interface vs Abstract Class

##  Feature	          Interface	                          Abstract Class

Abstraction level	  100% (till Java 7)	              Partial
Methods	              All abstract by default	          Both abstract and concrete
Variables	          public static final by default	  No restriction
Constructor	           ❌ NO	                            ✅ YES
Object creation	       ❌ NO	                             ❌ NO
abstract keyword	   Not mandatory	                  Mandatory for abstract methods
Keyword used	       implements	                      extends

## Inheritance Rules with Interfaces

## Relationship	         Keyword
   Class → Class	     extends
  Interface → Class	     implements
 Interface → Interface	 extends