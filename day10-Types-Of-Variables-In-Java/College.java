public class College {

    // static variable — shared across all objects
    static String collegeName = "ACE Engineering College";

    String studentName;
    int age;

    College(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    void display() {
        System.out.println("College: " + collegeName); // shared
        System.out.println("Student: " + studentName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        College c1 = new College("Upendra", 22);
        College c2 = new College("Goud", 23);
        College c3 = new College("Ravi", 21);

        c1.display();
        c2.display();
        c3.display();

        // changing static variable affects ALL objects
        College.collegeName = "Pondicherry University";

        System.out.println("--- After update ---");
        c1.display();
        c2.display();
        c3.display();
    }
}