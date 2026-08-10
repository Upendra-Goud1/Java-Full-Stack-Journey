public class LocalVariableDemo {

    void calculate() {
        // local variable — exists only inside this method
        int b = 10;
        int result = b * 2;
        System.out.println("Result: " + result);
        // b and result are deleted from stack after this method ends
    }

    public static void main(String[] args) {

        LocalVariableDemo obj = new LocalVariableDemo();
        obj.calculate();

        // System.out.println(b); // ERROR — b not accessible here
    }
}