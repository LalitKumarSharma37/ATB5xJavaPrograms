package src.oops_13_J.abstraction.realtimeexample;

public class TC1_CHROME extends BaseClass{

    String openBrowser(){
        System.out.println("Starting CHROME");
        return null; //It should be done like this
    }

    String closeBrowser(){
        System.out.println("Ending CHROME");
        return ""; //It should be done like this also
    }
}
