# Day 6 — Methods and Type Casting

## 1) Methods

A method is a reusable block of code that performs a specific task. Methods help avoid code duplication and make programs more organized. A method has a name, return type (void, int, String, etc.), and optional parameters. When you call a method, Java executes that block of code.

Method syntax: returnType methodName(parameters) { code }

## 2) Type Casting

Type casting is converting a variable from one data type to another. There are two types:

## i) Implicit Type Casting (Widening)

Automatically done by Java when converting from a smaller data type to a larger one. No data loss.

Order (smallest to largest): byte → short → int → long → float → double

## ii) Explicit Type Casting (Narrowing)

Manually convert from a larger data type to a smaller one. Risk of data loss. Syntax: (targetType) value

