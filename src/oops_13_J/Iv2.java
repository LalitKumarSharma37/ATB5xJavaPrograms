package src.oops_13_J;

public class Iv2 {

    public static void main(String[] args) {
        Person02 p = new Person02();
        Person02 p1 = new Person02();
        Person02 p2 = null;
        // p2.run();
        p1.run();
    }
}


class Person02{

    int a;
    void run(){
        System.out.println("Run called");
    }
}