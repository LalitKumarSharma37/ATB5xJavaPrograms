package src.oops_14_J.innerclass;

public class Lab158 {

    public static void main(String[] args) {
        parent p = new parent();
        Child c = new Child();
        p = c;
    //    c = p; //Not possible because child not present before parent
        Hello h = new Hello();
        Hello h1 = new Child2();
     //   Child2 c2 = Hello(); //Not possible
        Child2 c2 = (Child2)h1; //Downcasting in class
        Child2 c3 = (Child2)h1;
    }
}

//Upcasting and Downcasting in Class

class parent{

}
class Child extends parent{}

class Hello{}
class Child2 extends Hello{}