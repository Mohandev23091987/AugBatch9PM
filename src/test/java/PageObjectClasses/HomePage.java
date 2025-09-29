

package PageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //locators
//    private By userName =By.xpath("");
//    private By passWord =By.xpath("");
//    private By login =By.xpath("");

    private By manualTab =By.xpath("(//a[text()='Manual'])[last()]");


    //methods
//    public void enterUsername(){
//
//        driver.findElement(userName).sendKeys();
//        driver.findElement(passWord).sendKeys();
//        driver.findElement(login).click();
//
//
//    }

//    public void clickOnManualTab(){
//        WebElement element = driver.findElement(manualTab).click();
//    }





}
