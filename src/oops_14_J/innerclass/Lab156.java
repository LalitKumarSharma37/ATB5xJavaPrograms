package src.oops_14_J.innerclass;

public class Lab156 {
    public static void main(String[] args) {

        Thread t = new Thread() {
            public void run() {
                System.out.println("I am a THREAD");
            }
        };
        t.run();
    }
}
