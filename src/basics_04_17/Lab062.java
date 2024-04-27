package src.basics_04_17;

public class Lab062 {
    public static void main(String[] args){

        // JDK 13 - This switch code work in and after JDK 13
        int itemCode = 002;
        switch (itemCode) {
            case 001, 002, 003 :
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
            default:
                System.out.println("It's a software product!");
        }
    }
}
