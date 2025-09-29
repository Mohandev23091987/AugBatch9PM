package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;


    public static WebDriver getDriver(){
        return new ChromeDriver();
    }


    public static void quitDriver(){
            driver.quit();
    }

}
