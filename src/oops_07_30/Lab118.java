package src.oops_07_30;

import java.util.Scanner;

public class Lab118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String c = sc.next();
        boolean result = isPalindrome(c);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

    private static boolean isPalindrome(String userInput) {
    String b = userInput;
    StringBuilder sb = new StringBuilder(userInput);
    String reverse_string = sb.reverse().toString();
    return b.equalsIgnoreCase(reverse_string);
    }
}
