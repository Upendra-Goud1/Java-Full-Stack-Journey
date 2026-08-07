# Day 7 — Strings in Java

## String Basics:

A string stores a group of characters.
String is a CLASS, NOT a primitive data type. (The 8 primitive types are: byte, short, int, long, float, double, char, boolean.)
Strings can be created in two ways: using literals or using objects.

## String Constant Pool (SCP):

When you create a string using literals (e.g., String s = "upendra"), it's stored in the String Constant Pool inside the heap.
If you create another string with the same literal value, Java doesn't create a new object — it reuses the existing reference. Both variables point to the same memory address.
Example: s1 = "college", s2 = "college", s3 = "college" — all three variables reference the same object in the SCP.

## Immutability:

Strings are immutable in Java — once created, they cannot be modified.
When you "update" a string (e.g., s = s + "text"), Java creates a new String object and makes the variable point to it. The original string is unchanged and eventually garbage collected.

## Literals vs Objects:

Literals (String s = "text"): stored in String Constant Pool (SCP), reused if duplicate.
Objects (String s = new String("text")): always creates a new object in the heap, even if identical strings exist elsewhere.

## Comparison:

== compares memory addresses (references) — two objects with same content but different addresses return false.
.equals() compares content — two objects with same content return true.

## Methods in String 

1) equals(String s)                       - > Compares the content of two strings and returns true if they are identical
2) length()	                              -> Returns the number of characters in the string
3) charAt(int index)                      -> Returns the character at the specified index position
4) isEmpty()	                          -> Returns true only if the string length is 0 (a space is not empty)
5) isBlank()	                          -> Returns true if the string is empty or contains only whitespace
6) equalsIgnoreCase(String s)	          -> Compares two strings ignoring uppercase and lowercase differences
7) contains(String s)	                  -> Returns true if the string contains the specified substring
8) startsWith(String s)	                  -> Returns true if the string begins with the specified substring
9) endsWith(String s)	                  -> Returns true if the string ends with the specified substring
10) indexOf(char/String)	              -> Returns the index of the first occurrence of a character or substring (-1 if not found)
11) lastIndexOf(char/String)	          -> Returns the index of the last occurrence of a character or substring (-1 if not found)
12) substring(int start, int end)	      -> Extracts and returns a portion of the string from start index to end-1 index
13) trim()	                              -> Returns a new string with leading and trailing whitespace removed
14) replace(String old, String new)       -> Replaces all occurrences of the old substring with the new substring
15) replaceFirst(String old, String new)  -> Replaces only the first occurrence of the old substring with the new substring
16) split(String delimiter)          	  - > Splits the string into an array of substrings based on the specified delimiter