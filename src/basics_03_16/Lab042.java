package src;

public class Lab042 {
    public static void main(String[] args) {
        // Decrement operator.

        int b = 10;
        System.out.println(--b + b--);
        System.out.println(b);

        // A -> --b - Exp -> 9 , b = 9
        // B -> b-- -> Exp -> 9 , b -> 8
    }
}
