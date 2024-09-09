package src.oops_07_J.Inheritance.hierarchical;

public class Vehicle {

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehiclehasTospeed(){
       System.out.println("Yeah from" +getClass().getSimpleName());  //Use for print class name
    }
}
