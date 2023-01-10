package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

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

    }

    @When("user input email {string}")
    public void userInputEmail(String email) {
    }

    @And("user input no handphone {string}")
    public void userInputNoHandphone(String handphone) {
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
    }

    @And("user input confirm password {string}")
    public void userInputConfirmPassword(String password) {
    }

    @And("user input first name {string}")
    public void userInputFirstName(String firstName) {
    }

    @And("user input last name {string}")
    public void userInputLastName(String lastName) {
    }

    @And("user input city {string}")
    public void userInputCity(String city) {
    }

    @And("user click daftar")
    public void userClickDaftar() {
    }
}
