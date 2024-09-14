package src.oops_14_J.exceptions;

public class Lab165 {

    public static void main(String[] args) {

        try{
        String ip = args[0];
        int a = Integer.parseInt(args[0]);
        int b = 10 / a;
        System.out.println(a);
        System.out.println(b);
    } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {

        System.out.println(e.getMessage());
    }
        catch (Exception e){
        System.out.println(e.getMessage());
    }
        finally {
        // 100% executed
        System.out.println("I will be executed anyHow This cockerage who can survive the nuclear attack");
    }

}
    }
