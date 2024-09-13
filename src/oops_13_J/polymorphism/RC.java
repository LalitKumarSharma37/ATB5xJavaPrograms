package src.oops_13_J.polymorphism;

public class RC {

    public static void main(String[] args) {

        new Person().Speak(10); //So here this is done in method overloading JVM know about it compile time
        new Person().Speak("Pramod");
        new Person().Speak(3.144);
        new Person().Speak(2.17f);
    }
}
