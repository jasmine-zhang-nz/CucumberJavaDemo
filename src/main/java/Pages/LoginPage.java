package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private WebDriver driver;

    //region web element
    @FindBy (xpath = "//h1[.='Log in to Twitter']")
    private WebElement loginTitle;

    @FindBy (className = "input.js-username-field.email-input.js-initial-focus")
    private WebElement usernameTextbox;

    @FindBy(className = "input.js-password-field")
    private WebElement passwordTextbox;

    @FindBy(className = "button.submit.EdgeButton.EdgeButton--primary.EdgeButtom--medium")
    private WebElement loginButton;
    //endregion

    public LoginPage(){
        driver = getWebDriver();
    }

    public void enterUsername(String username){
        usernameTextbox.clear();
        usernameTextbox.sendKeys(username);
    }

    public void enterPassword(String password){

        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();

    }
}
