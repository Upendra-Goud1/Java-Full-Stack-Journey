package runtimeexception;

import java.util.Scanner;

public class FinallyDemo {

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
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("entered finally");
            sc.close(); // always close resources here
        }

        System.out.println("byeee...");
    }
}