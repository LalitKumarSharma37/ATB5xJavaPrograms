package src.oops_14_J.innerclass;

public class Lab157 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable(){  //This is also a thread

            public void run(){
                System.out.println("Thread,Anonymous Class!!");
            }
        };
    }
}
