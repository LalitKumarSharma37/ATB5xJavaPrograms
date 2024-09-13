package src.oops_13_J.polymorphism.method;

public class Person {

    //Method Overloading -> Means Multiple method with same name but different argument

    void Speak(String a){
        System.out.println("A is String " +a);
    }

    int Speak(float x){
        System.out.println("X is int " +x);
        return 89;
    }

    int Speak(int x){
        System.out.println("X is int " +x);
        return x;
    }

    void Speak(double d){
        System.out.println("X is Double " +d);
    }


}
