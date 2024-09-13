package src.oops_13_J.abstraction.interfaces.askinterviewquestions;

public class RC2   {
    public static void main(String[] args) {

    }
}

class Lucky implements Pramod{


    public void atb1(){
        System.out.println("atb1");
    }
}




  interface Pramod extends Course{
//     Pramod(){
//     }
  }

 interface Course{
    void atb1();
 }