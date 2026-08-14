package runtimepolymorphism;
public class FinalVar {

    public static void main(String[] args) {

        final int speed = 120;
        // speed = 150; // ERROR — cannot change final variable

        System.out.println("Max Speed: " + speed);
    }
}