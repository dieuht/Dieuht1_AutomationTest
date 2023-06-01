package JavaOOP3.common;

import java.util.concurrent.Callable;

public class BaseTest {
    public void createBrowser(String browser, boolean report, boolean headless){
        Constants.setBrowser(browser);
        Constants.setReport(report);
        Constants.setHeadless(headless);
        System.out.println("Browser: " + Constants.getBrowser());
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless());
    }
    public void closeBrowser(){
        System.out.println("Close Browser: " + Constants.getBrowser());
    }
}
