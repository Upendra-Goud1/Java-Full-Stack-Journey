# Day 10 — Types of Variables in Java

## 3 Types of Variables

## 1) Instance Variables

-> Declared outside all methods but inside a class
-> Stored in Heap memory
-> You need an object to access instance variables
-> Instance variables cannot be loaded without an object
-> When you create an object, memory is assigned only for that object's instance variables
-> Scope: can be accessed anywhere inside the class
-> JVM assigns default values to instance variables (0, null, false)

## 2) Static Variables

-> Declared outside all methods but inside a class using the static keyword
-> Stored in Method Area
-> Static variables are loaded when the class is loaded
-> They do not require an object to access
-> Memory is assigned to static variables when the class is loaded
-> Static variables allocate memory only once — all objects share the same data from the same method area
-> This saves huge memory
-> When to use static? → When values do not change across all instances
-> Disadvantage: If you update the value from one object, it will affect all instances

## Why is main method static?

Because JVM needs to access main() without creating an object
JVM calls this method directly when the program starts

Breaking down public static void main(String[] args):

## Keyword	  Meaning
public	      accessible from everywhere
static	      JVM can call it without creating an object
void	      no return type
main	      method name
String[] args array of strings — accepts multiple command line arguments
args	      variable name (can be anything)

## 3) Local Variables

-> Declared inside a method
-> Stored in Stack memory
-> You do not need an object to access local variables
-> Why does local variable have block scope?
-> Because local variables are stored inside the Stack
-> Stack gets cleared after the method finishes executing
-> So the variable only lives as long as the method is running
-> JVM will NOT give default values to local variables — you must initialize them manually
-> Local variable memory is assigned when the method is called
-> When method execution is completed, local variable memory is immediately deleted from the stack
-> Stack works temporarily

## Difference Between All 3 Variables

## Feature	       Instance	             Static	                Local
Stored in	        Heap	             Method area	        Stack
Requires object?	Yes	                  No	                No
Default values?	    Yes	                  Yes	                No — must initialize
Scope	            Whole class	          Whole class	        Inside method only
Lifetime	        Till object exists	  Till class is loaded	Till method finishes