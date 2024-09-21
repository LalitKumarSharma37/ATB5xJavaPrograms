package src.oops_20_J;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab171 {
    public static void main(String[] args) throws Exception{
      readFile("C://pramod.txt");

    }

    static void readFile(String fileName) throws Exception{
        File f = new File(fileName);
        FileReader filereader = new FileReader(fileName);
        if(fileName.length()==0){
            throw new FileNotFoundException();
        }
        System.out.println("Not Vul Code");
        int a = 10/0;
    }
}
