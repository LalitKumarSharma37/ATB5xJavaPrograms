package src.basics_05_23;

public class Lab096 {
    public static void main(String[] args) {

        //If you want to print at least once then use do-while

        //for -> Init -> Condition -> Increment/Decrement -> Body
        // While -> Init -> Condition -> Body -> Increment/Decrement

        // Do While
        // Do While -> Init -> Body -> Increment/Decrement -> Condition
        int a = 0;
        do {
            System.out.println(a);
            a--;
        } while (a > -5);
    }
}
