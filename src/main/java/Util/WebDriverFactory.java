package Util;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

    public static WebDriver createDriver(String driverType, Platform platform){

        WebDriver driver = null;
        String propertyName = "";
        String propertyPath = "";

        if(platform.is(Platform.WINDOWS)){
            propertyPath = "./drivers/win/chromedriver";
        }else{
            propertyPath = "./drivers/mac/chromedriver";
        }

        switch(driverType){
            case "chrome":
                propertyName = "webdriver.chrome.driver";
                driver = new ChromeDriver(ChromeDriverService.createDefaultService(), new ChromeOptions());
                break;
            case "safari":
                propertyName = "webdriver.gecko.driver";
                driver = new SafariDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
            }

            System.setProperty(propertyName, propertyPath);
            return driver;
    }
}
