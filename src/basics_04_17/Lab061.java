package src.basics_04_17;

public class Lab061 {
    public static void main(String[] args) {

        byte b = 20;
        switch(b){
            case 10:
                System.out.println("TEN");
            case 127:
                System.out.println("ONE TWENTY SEVEN");
            default:
                System.out.println("DEFAULT");
        }
    }
}
