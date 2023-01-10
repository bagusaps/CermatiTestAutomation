package setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver extends InitiateDriver{

    private static WebDriver driver;

    public void startBrowser(){
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver-new");
        driver = new ChromeDriver();
        setDriverInstance(driver);
    }

    public void closeBrowser(){
        driver.close();
    }
}
