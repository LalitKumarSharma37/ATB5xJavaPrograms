package src.basics_05_23;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {

        //sc.next() -> String;
        //sc.nextInt() -> int;
        //sc.nextdouble -> Double();
        //sc.nextboolean() -> Boolean();
        //sc.nextFloat() -> float();


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X");
        float x = sc.nextFloat();
        System.out.println("Enter the Y");
        double y = sc.nextDouble();
        System.out.println("Enter the Z");
        double z = sc.nextDouble();

        double result = 0;
       // double result;

        // 3/x^2 + y^2 - |z|
        // A+B-C -> A-> x^2 , B-> y^2 , C-> |z| abs(z) |-1|-> 1
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        //Scanner steam should be closed after we are done.
        //JVM will close the sc steam, but it is not good practise.
        //so close steam.
        sc.close();

    }
}
