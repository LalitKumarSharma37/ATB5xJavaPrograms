package src.oops_07_01.Inheritance.hierarchical;

public class Lab149 {
    public static void main(String[] args) {


//  Hierarchical means all child can access the property of parents like car truck can access the property of Vehicle
//       Car c = new Car();
//       Truck t = new Truck();
//       Vehicle v = new Vehicle();

        Vehicle v1 = new Car();
        //Car c2 = new Vehicle(); //Not Possible
        //Truck t = new Vehicle(); //Not Possible
        //Car c3 = new Truck(); //Not Possible
    }
}
