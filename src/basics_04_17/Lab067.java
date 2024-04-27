package src.basics_04_17;

public class Lab067 {
    public static void main(String[] args) {

//        int code = 12;
//        int val = switch (code) {
//            case 12:
//                yield 1;
//            case 34:
//                yield 2;
//            default:
//                throw new IllegalStateException("Unexpected value:" +code);
//        };
//        System.out.println(val);


        char code = 'B';
        int val = switch (code) {
            case 'A' :
                yield 65;
            case 'B' :
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };

        System.out.println(val);

    }
}
