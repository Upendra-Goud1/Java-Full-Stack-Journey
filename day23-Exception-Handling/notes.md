# Day 23 — Exception Handling
## What is an Exception?

Theory:

- > Exception causes an abnormal termination of your program
- > We can handle exceptions in Java by using try and catch keywords
- > What is the parent class of all exceptions? → Throwable

## 2 Types of Exceptions

## Type	               Also called	             Examples

Checked Exception	   Compile Time Exception	  FileNotFoundException, SQLException, IOException
Unchecked Exception	   Runtime Exception	      ArithmeticException, NullPointerException 

## Keywords in Exception Handling
## Keyword	               Purpose
   try	                  Write all error-prone code inside try block
   catch	              Used to handle the exception
   finally	              Always executes — irrespective of exception
   throw	              Used to throw custom exceptions manually
   throws	              Used at method declaration — delegates exception to calling method

   ## How many ways to handle exceptions? → Only ONE way — using try and catch
   
   ## Important rule: If you put catch(Exception e) before catch(ArithmeticException e), you get a compile-time   error — parent exception catch must always come after child exception catch.

   ## 3) finally Block

Theory:

 - > finally will execute always
 - > It does not depend on exception
 - > Irrespective of exception — finally runs
 - > Used for cleanup purpose / resource closing
 - > Always close resources in finally block

## When does finally NOT execute?

 - > When System.exit(0) is called — it forcefully shuts down JVM, terminates the program and will not execute the finally block
 - > Through out of memory error

 ## 4) Compile Time Exception (Checked) — throws

Theory:

- > throws is used at the method declaration
- > We cannot handle the exception using throws
- > We can only delegate/cascade the exception to the calling method

## 5) throw keyword

Theory:

- > throw will NOT handle your exception
- > Just used to throw custom exceptions
- > But still exceptions should be handled by a catch

## 6) Customized Exceptions

How to create a custom exception:

- > Create a class
- > Extend with RuntimeException
- > Create a parameterized constructor
- > Call parent constructor using super()
