package src.oops_14_J.exceptions;

public class Lab167 {

    public static void main(String[] args) {
        try {
            int a = 0;
            int x = 10 / a; //This line have error that'swhy this will not executed
        } catch (Exception e) {
            System.out.println("Exit");
//           System.exit(0); // JVM to stop
        } finally {
            System.out.println("I am final");
        }
    }
}
