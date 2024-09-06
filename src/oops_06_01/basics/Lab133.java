package src.oops_06_01.basics;

public class Lab133 {
    public static void main(String[] args) {
        //Immutable in nature-> that can't be changed
        String str1 = "Pramod";  //Create in SCP
        String str2 = new String("Pramod"); //Create in OA
        //Muttable in nature-> that can changed
        StringBuilder sb3 = new StringBuilder("Pramod");  //Create in OA
        StringBuffer sbuff4 = new StringBuffer("Hello"); //Create in OA

        sb3.append(" Dutta");  //Use as a concatenation
        System.out.println(sb3);

        sbuff4.append(" World");
        System.out.println(sbuff4);
    }
}
