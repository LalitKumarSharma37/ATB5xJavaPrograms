package src.oops_13_J.polymorphism.methodover;

public class RC {

    public static void main(String[] args) {
//        Dog d = new Dog();  //Depend on this object it will print object data
//        d.bark();
        Hound h = new Hound(); //Depend on this object it will print object data
        h.bark();
      Dog d = new Hound(); //Dynamic Dispatch
      //Runtime Polymorphism
      d.bark();

//    Hound h1 = new Dog(); //Till Java 22 this is not possible
//    h1.bark();
    // Latest java 22 - It is never possible in Java
    }

}
