# Day 15 — Access Modifiers

## What are Access Modifiers?

Access modifiers decide the access of your variables, methods, classes, and constructors. They control who can access what in your project.

## There are 4 access modifiers in Java:

public
private
protected
default

## 1) public

Theory:

- > public can be used with variables, methods, classes, constructors
- > It will be accessible across your entire project — anywhere, any package, any class

## 2) private

Theory:

- > private can be used with variables, methods, constructors
- > We cannot use private with classes (top-level classes cannot be private)
- > If you make something private in a class, you will be able to access it only within the same class
- > If you make a constructor private, then you cannot create an object of that class in another class
- > private constructor is used in the Singleton Design Pattern

## 3) protected

Theory:

- > protected can be used with variables, methods, constructors
- > You can access within the same package
- > In a different package, protected members are accessible only when they are sub classes (child classes)
- > Protected variables and methods can be accessible within the same package, but they are accessible in a    different package only when they are sub classes

## 4) default (no keyword)

Theory:

- > When you don't write any access modifier, it becomes default
- > You can access only within the same package
- > If you try to access from a different package, it will throw an error
- > default is also called package-private