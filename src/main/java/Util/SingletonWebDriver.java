package Util;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

public class SingletonWebDriver {

    private static WebDriver driver;

    public static WebDriver getDriver()
    {
            if (driver == null)
            {
                driver = WebDriverFactory.createDriver(System.getenv("DriverType"), Platform.getCurrent());
                driver.manage().window().maximize();
            }
            return driver;
    }

    public static void SetDriver(WebDriver driver)
    {
        driver = driver;
    }

    public static void QuitDriver()
    {
        if (driver == null)
            return;

        driver.quit();
        SetDriver(null);
    }

}
