package Pages;

import Util.SingletonWebDriver;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;
    private String resourcePath;

    public BasePage(){
        driver = SingletonWebDriver.getDriver();
    }

    public WebDriver getWebDriver(){
        return driver;
    }

    public void setResourcePath(String resourcePath){
        this.resourcePath = resourcePath;
    }

    public String getResourcePath(){
        return this.resourcePath;
    }

    public boolean pageIsLoadedCorrectly(){

        return driver.getCurrentUrl().contains(resourcePath);
    }

}
