package src.oops_13_J.abstraction.realtimeexample;

public abstract class BaseClass {  //Abstarction is use to force child class to do something

    abstract String openBrowser();

    abstract String closeBrowser();

    void print(){
        System.out.println("Logs");
    }
}
