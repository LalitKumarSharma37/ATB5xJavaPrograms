package src.oops_07_01;

public class Lab143 {
    public static void main(String[] args) {

        //this
        //constructor
        //inheritance
        //encaps
        //abstrac
        //super()

        ATBPerson p = new ATBPerson();
        p.name = "Pramod";
        System.out.println(p.name);


        ATBPerson p2 = new ATBPerson("Hitesh");
        p2.printdetail();



//        String s;  //Local variable default value is never assigned by JVM
//        System.out.println(s);



        //Constructor
        //Constructor is used to construct the object of a class
        //Name must be exactly same as class
        //comstructor is a special method because
        //it does not have a return type

        // Default constructor - Use 18-19%
        //Parameterized constructor - Use 70%
        //copy constructor in Java - Use <1%

    }
}
