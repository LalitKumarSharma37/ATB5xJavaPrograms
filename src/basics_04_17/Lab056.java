package src.basics_04_17;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {

        // If, Switch -  Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition
        //Switch - Must be byte,short,int,long

        // Which day is today!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell you which day it is");
        int dayNumber = sc.nextInt();

        switch (dayNumber){

            //default:
                //System.out.println("Are You Mad?");
                //break;
            //break is important if default is use before case 1 or use in first option.
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Are You Mad?");
                break; //This break is optional if default is last option

        }

        System.out.println(" - End of Program - ");
    }
}
