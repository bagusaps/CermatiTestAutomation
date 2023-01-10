package pages;

import org.openqa.selenium.WebDriver;
import setups.InitiateDriver;

public class RegisterPage {

    private WebDriver driver;
    public RegisterPage(){
        this.driver = InitiateDriver.getDriverInstance();
    }

    public void openCermatiRegisterPage(){
        driver.get("https://www.cermati.com/app/gabung");
    }
}
