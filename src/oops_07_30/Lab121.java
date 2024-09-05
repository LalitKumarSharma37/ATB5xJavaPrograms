package src.oops_07_30;
import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();
        System.out.println("Enter the c");
        int c = sc.nextInt();

        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("Value of a " +a);
        System.out.println("Value of b " +b);
        System.out.println("Value of c " +c);
    }
}
