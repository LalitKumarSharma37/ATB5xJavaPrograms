package src.basics_05_23;

public class Lab085 {
    public static void main(String[] args) {

        //continue -> If this condition true -> continue;
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5) continue;  //By using continue here,when condition true(5==5) then continue go to for loop again
                System.out.println("After");
        }
    }
}
