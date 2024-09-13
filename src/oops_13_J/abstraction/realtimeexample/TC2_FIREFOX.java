package src.oops_13_J.abstraction.realtimeexample;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openBrowser() {
        return "Starting FIREFOX";
    }

    @Override
    String closeBrowser() {
        return "Closing FIREFOX";
    }
}
