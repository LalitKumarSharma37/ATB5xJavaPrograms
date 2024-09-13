package src.oops_13_J.encapsulation;

public class Lab147 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Amit";
        s1.printInfo();

        // Getter and setter - Condition Based
        // They should hidden

        PersonS personS = new PersonS();
        personS.id = 1;
        personS.id = 99;
    }
}
