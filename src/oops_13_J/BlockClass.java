package src.oops_13_J;

public class BlockClass {
    { //Instance Intialization Block
        System.out.println("I am IIB");
    }

    BlockClass(){
        System.out.println("I am DC");
    }

    static { //SIB Static Initialization Block
         System.out.println("I am SIB");
    }
}
