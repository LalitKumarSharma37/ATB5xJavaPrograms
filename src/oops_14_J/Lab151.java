package src.oops_14_J;

public class Lab151 {

    public static void main(String[] args) {
        P01 p01 = new P01();
        P01 p02 = new P01();

        p01.m1();
        P01.m2();

        P01 p03 = null;
        // p03.m1(); //We can't call m1() function because object not created
        p03.m2();  //We can call m2() function because m2() function is static and no need to create oblect because it work on class created

    }

}

class P01 {
    static {
        System.out.println("SIB");  //Worked with How many time class created
    }

    {
        System.out.println("IIB");  //Worked with How many time Object created
    }


    int a = 10; //Instance variable
    static int b = 20; //static variable

    void m1() {
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }

    static void m2() {
//        System.out.println(a); // Can't access a because static method don't have instance variable
        System.out.println(b);
    }
}