package src.oops_14_J.innerclass;

public class Lab152 {
    public static void main(String[] args) {
        Car c = new Car("Lambo 137");
        c.drive();
        Car.Engine engine = c.new Engine("400CC");
        engine.start();
        c.drive();
    }
}

class Car{

    String make; //Instance variable

    //Parametrized Constructor
    public Car(String make) {
        this.make = make;
    }

    //Method

    void drive(){
        System.out.println("You can drive Car");
    }

    public class Engine{

        //Instance variables
        String hoursePower;

        //Parametrized Constructor
        public Engine(String hoursePower){
            this.hoursePower = hoursePower;
        }

        void start(){
            System.out.println("Engine is started!! ->"  +make);
        }
    }
}