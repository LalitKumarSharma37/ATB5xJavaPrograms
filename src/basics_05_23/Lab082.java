package src.basics_05_23;

public class Lab082 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        // Print the Odd number in between the 1 to 50.
        // If Else
        for (int i = 50; i>0; i--) {
            if(i%2==1){    // !(i%2==1) OR (i%2==0)
                System.out.println(i+ " is odd!");
            }
            if(i%2==0){  //if!(i%2=1)
                System.out.println(i+ "is Even");
            }
        }
        System.out.println(" --- End of Program!! --- ");


        // !(i%2==1) OR (i%2==0)
    }
}
