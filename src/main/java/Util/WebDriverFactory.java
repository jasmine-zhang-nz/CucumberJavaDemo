package Util;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

    public static WebDriver newDriver(String driverType){


            switch(driverType){
                case "chrome":
                    return new ChromeDriver(ChromeDriverService.createDefaultService(), new ChromeOptions());
                case "safari":
                    return new SafariDriver();
                default:
                    return new FirefoxDriver();
            }
    }

    public static void setupOS(){

        if(Platform.getCurrent().is(Platform.MAC)){
            System.setProperty("webdriver.chrome.driver", "./drivers/mac/chromedriver");
        }
        if(Platform.getCurrent().is(Platform.WINDOWS)){
            System.setProperty("webdriver.chrome.driver", "./drivers/win/chromedriver");
        }


    }
}
