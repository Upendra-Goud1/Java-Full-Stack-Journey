# Day 08: Arrays In Java

## 1) Arrays

An array stores multiple values of the same data type in a single variable. Arrays have a fixed size — once created, the size cannot be changed.

Syntax:

java
dataType[] arrayName = new dataType[size];
int[] arr = new int[5];

Key rules:

Array index starts from 0
Array index ends at length - 1
If you give array size as negative (e.g., new int[-1]), Java throws NegativeArraySizeException
Arrays are stored in the Heap area

## 2) Contiguous Memory Location

Arrays store values in contiguous (continuous) memory locations — this means all elements are stored next to each other in memory with no gaps. This is why arrays are faster to access.

Why arrays are faster:

Java stores values in arrays in contiguous memory locations
It fetches values using the memory address directly
CPU can calculate any element's address instantly using the formula:
Address of arr[index] = Base address + (dataType size × index)

notes:

int[] arr = new int[1000];
Base address = 1000
arr[500] = ?
Then: 1000 + (4 × 500) = 1000 + 2000 = 3000 (memory address)

int array memory layout:

Each int takes 4 bytes
arr[0] = address 100
arr[1] = address 104 (100 + 4)
arr[2] = address 108 (104 + 4)
CPU range: 100-120 (continuous block)

## 3) 2D Array

A 2D array is an array of arrays — like a table with rows and columns. Used to store data in matrix/grid format.

