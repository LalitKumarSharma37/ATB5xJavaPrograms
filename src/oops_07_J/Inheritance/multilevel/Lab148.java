package src.oops_07_J.Inheritance.multilevel;

public class Lab148 {
    public static void main(String[] args) {

//        Grandfather g = new Grandfather();
//        Father f = new Father();
//        Son s = new Son();
//        s.bhk2();

        Grandfather g = new Son();
        g.bhk3(); // Disadvantage is "g" can access only grandfather class, because grandfather know about only him
//        Father f = new Son();
//        Son s = new Grandfather(); //Not Possible
//        Son s = new Father(); //Not Possible
        Son s = new Son(); // Son can access all class
        s.bhk3();
        s.bhk2();
        s.bhk1();

    }
}
