package src.oops_13_J.abstraction.interfaces.askinterviewquestions;

public class II1 {
    public static void main(String[] args) {
    Hello h = new Hello();
    h.say();
    h.hello();

    I1 i = new Hello();  //Interface reference is possible to create hello object because Hello class implements Interface I1
       i.hello();  //call child method because child object is created
    }

}

interface I1{
    void say();

    default void hello(){  //parent method
        System.out.println("Hello Default");
    }
}

interface P{

}

class Hello implements I1{
    public void say(){
        System.out.println("say");
    }
    public void hello(){   //child method
       System.out.println("hello");
    }
}