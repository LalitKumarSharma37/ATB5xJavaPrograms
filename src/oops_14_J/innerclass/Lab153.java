package src.oops_14_J.innerclass;

public class Lab153 {

    public static void main(String[] args) {
    OOC ooc = new OOC();
    OOC.SNCI OOC = new OOC.SNCI();
    OOC.show();
    }

}

class OOC {
    static int a = 100;
    int a1 = 900;

    static class SNCI{
        void show(){
        //    System.out.println(a1); //Not possible to access a1 because of non static
              System.out.println(a);
        }
    }
}
