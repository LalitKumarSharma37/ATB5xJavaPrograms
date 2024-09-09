package src.oops_07_30D;
import java.util.Scanner;
public class Lab129 {
//    public static void main(String[] args) {
//
//        String name = "Pramod"; // P r a m o d
//
//        String y = "";
//
//        for (int i = name.length() - 1; i >= 0; i--) {
//            y = y + name.charAt(i); //charAt() -> Use for return char at the specified index in the string
//        }
//        System.out.println(y);
//
//
//    }
//}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        String y = "";

        for(int i=s.length()-1;i>=0;i--){
            y = y+s.charAt(i);
        }
        System.out.println(y);
    }
}