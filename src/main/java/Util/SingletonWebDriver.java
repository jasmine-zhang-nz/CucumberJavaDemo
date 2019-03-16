package Util;

import org.openqa.selenium.WebDriver;

public class SingletonWebDriver {

    private static WebDriver driver;

    public static WebDriver getDriver()
    {
            if (driver == null)
            {
                driver = WebDriverFactory.NewDriver(ConfigurationManager.AppSettings.Get("WebDriverType"));
                driver.Manage().Window.Maximize();
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
