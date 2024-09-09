package src.oops_07_01.Inheritance;

public class Lab147 {
    public static void main(String[] args) {

      // Programming p = new Programming(); // Only programming DC called
       Java j = new Java();  //Parent and child DC called, Child ref with child object
//      // Programming p = new Java(); // Parent can use/access child class
//      // Java j2 = new Programming(); //Child reference can't use/access parent object
//
       j.car();
       j.bhk3();
       j.author = "James Gosling";

       Python p = new Python();
       p.bhk3();
    }
}
