# Day 12 — this vs super keyword
this keyword

Theory:

this is a keyword in Java (not a method name)
It refers to the current instance / same class instance
Used for accessing current class variables and constructors
this() → calls the current class constructor
this or super cannot be used in a static method
Why? Because static methods are loaded at class loading time — they do not have a this object by that time, so this or super cannot work there
super keyword

Theory:

super refers to the parent class reference
Used for accessing parent class variables, methods, and constructors
super() → calls the parent class constructor
super and this must always be the first line in a constructor
Can one constructor have both this() and super()? → NO
Because both this() and super() must be the first line, but you can only have one first line — so having both is not possible

## Important Rule — super() in constructors

Whenever you create an object for a child class, your parent class object gets created automatically
JVM calls super() automatically if you don't call it explicitly
If you did not call super(), then JVM will call super() automatically