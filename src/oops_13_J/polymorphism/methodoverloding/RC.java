package src.oops_13_J.polymorphism.method;

public class RC {

    public static void main(String[] args) {

        new src.oops_13_J.polymorphism.method.Person().Speak(10); //So here this is done in method overloading JVM know about it compile time
        new src.oops_13_J.polymorphism.method.Person().Speak("Pramod");
        new src.oops_13_J.polymorphism.method.Person().Speak(3.144);
        new src.oops_13_J.polymorphism.method.Person().Speak(2.17f);
    }
}
