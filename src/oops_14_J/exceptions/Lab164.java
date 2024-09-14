package src.oops_14_J.exceptions;

import java.io.FileInputStream;

public class Lab164 {
    public static void main(String[] args) {

     //Unchecked Exception, Runtime error
        String name = null;
     name.trim();

     //Checked Exception , Compile Time - JVM If Knows about it, - Checked Exception
        try{
            FileInputStream f = new FileInputStream("dasda");
        }
        catch (Exception e){
            System.out.println();
        }
    }
}
