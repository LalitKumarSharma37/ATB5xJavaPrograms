package src.oops_20_J;

import java.io.File;
import java.io.FileReader;

public class Lab173 {
    public static void main(String[] args) {
        int a = 10/0; //UnChecked - JVM don't know?
        // Checked
        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
