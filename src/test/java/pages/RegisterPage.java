package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import setups.InitiateDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPage {

    private WebDriver driver;
    public RegisterPage(){
        this.driver = InitiateDriver.getDriverInstance();
    }

    private static String TITLE_REGISTER_PAGE_XPATH="//h1[contains(text(),'Daftar Akun')]";
    private static String INPUT_EMAIL_REGISTER_XPATH="//input[@id='email']";
    private static String INPUT_PHONE_REGISTER_XPATH="//input[@id='mobilePhone']";
    private static String INPUT_PASSWORD_REGISTER_XPATH="//input[@id='password']";
    private static String INPUT_CONFIRM_PASSWORD_REGISTER_XPATH="//input[@id='confirmPassword']";
    private static String INPUT_FIRST_NAME_REGISTER_XPATH="//input[@id='firstName']";
    private static String INPUT_LAST_NAME_REGISTER_XPATH="//input[@id='lastName']";
    private static String INPUT_CITY_REGISTER_XPATH="//input[@id='cityAndProvince']";
    private static String BUTTON_REGISTER_XPATH="//p[contains(text(),'Daftar')]";

    public void openCermatiRegisterPage(){
        driver.get("https://www.cermati.com/app/gabung");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public Boolean isRegisterPageDisplayed(){
        return driver.findElement(By.xpath(TITLE_REGISTER_PAGE_XPATH)).isDisplayed();
    }

    public void inputEmailRegister(String email){
        driver.findElement(By.xpath(INPUT_EMAIL_REGISTER_XPATH)).sendKeys(email);
    }

    public void inputPhoneRegister(String phone){
        driver.findElement(By.xpath(INPUT_PHONE_REGISTER_XPATH)).sendKeys(phone);
    }
    public void inputPasswordRegister(String password){
        driver.findElement(By.xpath(INPUT_PASSWORD_REGISTER_XPATH)).sendKeys(password);
    }
    public void inputConfirmPasswordRegister(String confirmPassword){
        driver.findElement(By.xpath(INPUT_CONFIRM_PASSWORD_REGISTER_XPATH)).sendKeys(confirmPassword);
    }
    public void inputFirstNameRegister(String firstName){
        driver.findElement(By.xpath(INPUT_FIRST_NAME_REGISTER_XPATH)).sendKeys(firstName);
    }

    public void inputLastNameRegister(String lastName){
        driver.findElement(By.xpath(INPUT_LAST_NAME_REGISTER_XPATH)).sendKeys(lastName);
    }

    public void inputCityRegister(String city){
        driver.findElement(By.xpath(INPUT_CITY_REGISTER_XPATH)).sendKeys(city);
    }

    public void clickRegisterButton(){
        driver.findElement(By.xpath(BUTTON_REGISTER_XPATH)).click();
    }
}
