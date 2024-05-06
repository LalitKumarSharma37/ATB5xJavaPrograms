package src.basics_05_23;

import java .util.Scanner;

public class Lab095 {
    public static void main(String[] args) {

        //Program
        //Sum of digit -> 5+4+3+2+1 = 15

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to print sum of digit");
        int num = sc.nextInt();

        long fact = 0;
         for(int i=1;i<=num;i++){
             fact = fact + i;
         }
        System.out.println("Sum of Digit ->" +fact);
    }
}
