package src.oops_14_J;

public class StaticDemo {

    // Static variable
    public static String college_name = "TheTestingAcademy";

    // Non static variable -> Local variable or Instance variable
    public int version = 3;  //Instance variable

    // Static method
    public static void printName() {
        int age = 40;
        System.out.println("Name is :" + college_name);
        // You can't have an Instance variable into the Static Method!!
        //System.out.println("Version is : " + version);
    }
    // Non static method
    public void printVersion() {
        int age = 40;
        System.out.println("Version is : " + version);
        System.out.println("Name is :" + college_name);
    }

}
