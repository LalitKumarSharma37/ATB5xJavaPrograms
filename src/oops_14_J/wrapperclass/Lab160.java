package src.oops_14_J.wrapperclass;

public class Lab160 {

    public static void main(String[] args) {
        int x = 123; //Primitive data Type
//      String st1 = x; //Not possible because of diff. data type
//      String st1 = (String)x; //Downcasting also not possible
        String st1 = x+""; //Through concatenation it is possible
        String s1 = String.valueOf(x); //Possible through valueOf
        System.out.println(st1);
        System.out.println(s1);
    }
}
