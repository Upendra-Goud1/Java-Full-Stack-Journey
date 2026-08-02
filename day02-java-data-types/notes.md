# Day 2 — Java Data Types

## What are Data Types?
We tell Java what type of variable we are creating — number, character, 
string, true/false, decimal — using data types.

There are two types of data types in Java:

## 1. Primitive Data Types (8 types)

| Type | Default Value | Size | Range/Notes|
|------|---------------|------             |-------------|
| byte | 0             | 1 byte (8 bits)   | -128 to 127 |
| short| 0             | 2 bytes (16 bits) | -32,768 to 32,767 |
| int  | 0             | 4 bytes (32 bits) | ~-2.1 billion to 2.1 billion |
| long | 0             | 8 bytes (64 bits) | very large numbers, needs `L` suffix |
| float| 0.0           | 4 bytes           | precision up to ~7 digits after decimal, needs `f` suffix |
|double| 0.0           | 8 bytes           | precision up to ~16 digits after decimal |
| char | '\u0000'      | 2 bytes           | single character, e.g. `'A'` |
| boolean | false      | ~1 bit            | true or false only |

Note: These 8 types are NOT classes — they are basic building blocks of Java.

## 2. Non-Primitive Data Types
User-defined data types / classes, such as:
- String
- Array
- Classes (custom objects)

## Key Rules Learned
- `long` literals need an `L` suffix (e.g., `9346306009L`)
- `float` literals need an `f` suffix (e.g., `500.12f`), otherwise Java 
  treats decimals as `double` by default
- Java is case-sensitive — `main`, `short`, `long`, `char` must be lowercase
- Variable names cannot contain spaces — use camelCase (e.g., `acBalance`)
