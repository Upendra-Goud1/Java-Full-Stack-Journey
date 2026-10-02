package customizedexceptions;

import java.util.Scanner;

public class CustomizedExceptions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter your age: ");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("you are eligible to vote");
            } else {
                throw new InvalidAgeException("you are not eligible to vote");
            }
        }
        catch (InvalidAgeException e) {
            System.out.println(e);
        }

        System.out.println("byoe...");

        sc.close();
    }
}