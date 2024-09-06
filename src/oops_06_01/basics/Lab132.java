package src.oops_06_01.basics;

public class Lab132 {
    public static void main(String[] args) {
        String str1 = "Pramod";
        String str2 = new String("Pramod");
        String str3 = new String("pramod");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
