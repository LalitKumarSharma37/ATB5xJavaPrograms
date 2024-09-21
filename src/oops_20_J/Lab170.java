package src.oops_20_J;

public class Lab170 {
    public static void main(String[] args) throws Exception {

        // int a = getA(0);
        int a = getA(10);
        throw new Exception("Hello");
    }

    private static int getA(int b) {
//        int a;
//        if (b==0){
//            throw new ArithmeticException("B Can't be zero");
//        }else{
//            a = 10/b;
//            System.out.println(a);
//            return a;
//        }
        //Web Automation -> throw Exception and exit the program
//    }
        try {
            int a = 10 / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return b;
    }
}

