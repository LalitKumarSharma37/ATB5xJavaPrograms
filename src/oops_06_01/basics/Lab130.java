package src.oops_06_01.basics;

public class Lab130 {
    public static void main(String[] args) {

        String name = "Pramod"; // String constant Pool
        String name2 = new String("Pramod"); // Heap area

        name = "Dutta";

        String str1 = "Hello";
        str1 = str1.concat(" World");
        System.out.println(str1);
        String str2 = "Hello";
        System.out.println(str2);
    }
}
