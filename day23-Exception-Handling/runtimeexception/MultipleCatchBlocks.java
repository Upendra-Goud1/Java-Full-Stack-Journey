package runtimeexception;

import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter num1: ");
            int num1 = sc.nextInt();
            System.out.println("enter num2: ");
            int num2 = sc.nextInt();

            int num3 = num1 / num2;
            System.out.println("after division: " + num3);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // prints specific exception
        }
        catch (RuntimeException e) {
            System.out.println(e); // catches any other runtime exception
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // parent — catches everything
        }

        System.out.println("byeee...");

        sc.close();
    }
}