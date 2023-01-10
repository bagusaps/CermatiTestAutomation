package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterSteps {

    RegisterPage registerPage;

    public RegisterSteps(){
        registerPage = new RegisterPage();
    }

    @Given("open register cermati page")
    public void openRegisterCermatiPage() {
        registerPage.openCermatiRegisterPage();
    }

    @Then("user in register cermati page")
    public void userInRegisterCermatiPage() {
        assert registerPage.isRegisterPageDisplayed().equals(true);
    }

    @When("user input email {string}")
    public void userInputEmail(String email) {
        registerPage.inputEmailRegister(email);
    }

    @And("user input no handphone {string}")
    public void userInputNoHandphone(String handphone) {
        registerPage.inputPhoneRegister(handphone);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        registerPage.inputPasswordRegister(password);
    }

    @And("user input confirm password {string}")
    public void userInputConfirmPassword(String password) {
        registerPage.inputConfirmPasswordRegister(password);
    }

    @And("user input first name {string}")
    public void userInputFirstName(String firstName) {
        registerPage.inputFirstNameRegister(firstName);
    }

    @And("user input last name {string}")
    public void userInputLastName(String lastName) {
        registerPage.inputLastNameRegister(lastName);
    }

    @And("user input city {string}")
    public void userInputCity(String city) {
        registerPage.inputCityRegister(city);
    }

    @And("user click daftar")
    public void userClickDaftar() {
        registerPage.clickRegisterButton();
    }
}
