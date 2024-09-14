package src.oops_14_J.interview;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a);
        Pramod p = new Pramod();
        p.m1();
    }
}

interface H{
    // Only Static variables

    int a = 10;
    public static final int b = 20; //we can remove publis static final because interface already have
    public static final int c = 99;
    void m1();  //Incomplete function
    //This is non static because of function
}
class Pramod implements H{


    @Override
    public void m1() {  //Complete function
    System.out.println("m1");
    }
}