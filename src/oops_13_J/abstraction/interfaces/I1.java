package src.oops_13_J.abstraction.interfaces;

import java.sql.SQLOutput;

public class I1 {

    public static void main(String[] args) {
     //  new A1();  No object create for interface class
        System.out.println(A1.a);  //We can access a variable by using class name
    }
}
interface A1{
    int a = 10; //final variable and static variable
}