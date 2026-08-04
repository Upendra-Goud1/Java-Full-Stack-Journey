# Scanner class and Conditional Statements

# Scanner Class

Scanner is a built-in Java class (from java.util package) used to read input from the user via the keyboard. It's commonly used with System.in to capture console input. Key methods: nextLine() reads a full line including spaces, next() reads only a single word (stops at the first space), nextInt() reads an integer, nextDouble() reads a decimal value.

## Conditional Statements

## 1) If Statement

The if statement executes a block of code only when a given condition evaluates to true. It's the most basic form of decision-making in Java.

## 3) Else If

else if lets you check multiple conditions in sequence. Java evaluates each condition top to bottom and executes the first block whose condition is true; the rest are skipped. If none match, the final else (if present) runs.

## 4) If-Else Ladder

Theory: An if-else ladder is a chain of if / else if / else if ... / else statements used when you have multiple possible outcomes to check against, such as matching a number to a day of the week.

## 5) Nested If

A nested if is an if statement placed inside another if (or else) block. It's used when a decision depends on first satisfying an outer condition, then checking further sub-conditions within it.

## 6) Switch Case

switch is an alternative to long if-else ladders when comparing a single variable against multiple fixed values. Each case represents a possible match, and break prevents "fall-through" into the next case. default runs when no case matches.

## 7) Command Line Arguments

args in main(String[] args) holds values passed to the program from the command line at the time of execution (e.g., java Arguments hello world 123). Each value is accessible as a String via its index, starting from args[0]. If no arguments are passed, accessing args[0] throws an ArrayIndexOutOfBoundsException.