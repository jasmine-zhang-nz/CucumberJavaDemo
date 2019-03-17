package Steps;

import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("^When user is on the login page$")
    public void when_user_is_on_the_login_page()  {
        loginPage = new LoginPage();
        loginPage.pageIsLoadedCorrectly();
    }
    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password) {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() {

        loginPage.clickLoginButton();
    }

    @Then("^user is on Home Page$")
    public void user_is_on_Login_Page() {
    }

}
