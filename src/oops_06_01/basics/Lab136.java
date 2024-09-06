package src.oops_06_01.basics;

public class Lab136 {
    public static void main(String[] args) {
        //Difference b/w StringBuilder and Buffer is thread safe
        //StringBuilder -> Not a Thread safe that'swhy it is faster , it's like I don't want to share food with other
        //StringBuffer -> thread safe means whatever value create in stringbuffer when T1,T2,T3 will come they use the value one by one
        //If something is thread safe, we avoid string buffer

        StringBuilder sb1 = new StringBuilder("Pramod");
        sb1.reverse();
        System.out.println(sb1);

    }
}
