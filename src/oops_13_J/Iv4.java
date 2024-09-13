package src.oops_13_J;

public class Iv4 {

    public static void main(String[] args) {

      //  System.out.println(P04.a); //Not possible to access a through class reference
          System.out.println(P04.b); //Possible to access static variable through class
      //  System.out.println(P04.run()); //Not even possible to access method through class reference
           P04.run1();
          System.out.println("Lalit");

    }
}

class P04{
    int a;
    static int b;

    static void run1(){
     System.out.println("Pramod");
    }

    void run(){

    }
}