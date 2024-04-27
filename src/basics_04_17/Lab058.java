package src.basics_04_17;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Char, I will tell if it is Vowel");
     //aeiou

     char user_input =sc.next().toCharArray()[0];
    System.out.println(user_input);  //It take first character because of .toCharArray()[0];

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");
        }



    }
}
