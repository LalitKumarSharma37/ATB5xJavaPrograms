package src.oops_06_01.basics;
import java.util.Scanner;
public class Lab137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will tell Palindrome");
        String s = sc.next();
        boolean result = isPalindrome(s);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    public static boolean isPalindrome(String userInput){
        String original_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        return original_str.equalsIgnoreCase(sb.toString());
    }
}
