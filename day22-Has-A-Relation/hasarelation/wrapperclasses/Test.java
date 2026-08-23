package hasarelation.wrapperclasses;

public class Test {

    public static void main(String[] args) {

        int a = 10;

        // new Integer(20) is deprecated — don't use this
        // Integer b = new Integer(20);

        // auto boxing — primitive to wrapper
        Integer c = Integer.valueOf(a); // before Java 5 — explicit
        Integer e = a;                  // after Java 5 — automatic auto boxing

        // auto unboxing — wrapper to primitive
        Integer b = Integer.valueOf(20);
        int d = b.intValue();           // before Java 5 — explicit
        int f = b;                      // after Java 5 — automatic auto unboxing

        System.out.println(a);  // 10
        System.out.println(b);  // 20
        System.out.println(c);  // 10
        System.out.println(d);  // 20
        System.out.println(e);  // 10
        System.out.println(f);  // 20
    }
}