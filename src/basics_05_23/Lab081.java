package src.basics_05_23;

public class Lab081 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

//        System.out.println("Print the value of i, but I want to break when i = 5");

        for (int i = 1; i<=10;++i) {
            System.out.println("Value of " + i);
            //++i;-so no matter use ++i and i++ because it used after printing value of i
        }
    }
}
