package setups;

import org.openqa.selenium.WebDriver;

public class InitiateDriver {

    private static WebDriver driver;

    public static WebDriver getDriverInstance() {
        return InitiateDriver.driver;
    }

    public void setDriverInstance(WebDriver instance) {
        InitiateDriver.driver = instance;
    }
}
