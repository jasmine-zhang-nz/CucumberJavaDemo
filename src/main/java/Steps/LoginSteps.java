package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^When user is on the login page$")
    public void when_user_is_on_the_login_page()  {

    }
    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password) {
    }

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() {
    }

    @Then("^user is on Login Page$")
    public void user_is_on_Login_Page() {
    }

}
