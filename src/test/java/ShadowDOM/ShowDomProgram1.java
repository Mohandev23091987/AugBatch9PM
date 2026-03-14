package ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShowDomProgram1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/shadow");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //========================================================
//        WebElement ele =driver.findElement(By.cssSelector("#fname"));
//
//        ele.sendKeys("mohan");
//========================================================================
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //==========================================
//       WebElement ele =  (WebElement) js.executeScript("return document.querySelector('#open-shadow').shadowRoot.querySelector('#fname')");
//        ele.sendKeys("mohan");

        //===================================
       // js.executeScript("document.querySelector('#open-shadow').shadowRoot.querySelector('#fname').value='Mohan'");
//=====================================================


//        driver.findElement(By.xpath("//div[@id='open-shadow']"))
//                .getShadowRoot().findElement(By.cssSelector("#fname")).sendKeys("Krishna");


        //js.executeScript("document.querySelector('my-web-component').myRoot.querySelector('#lname').value='selenium'");

        driver.findElement(By.xpath("//my-web-component")).getShadowRoot().findElement(By.cssSelector("#lname")).sendKeys("selenium");

    }
}
