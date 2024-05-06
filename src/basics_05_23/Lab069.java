package src.basics_05_23;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {

       //Take a input from the user and print the information

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = user_input.next();

        System.out.println("Enter your Age");
        int age = user_input.nextInt();

        System.out.println("Enter your Salary");
        double salary = user_input.nextDouble();

        System.out.println("Ypour details are" +Name +"  "  +age +" "  +salary);

        user_input.close();



    }
}
