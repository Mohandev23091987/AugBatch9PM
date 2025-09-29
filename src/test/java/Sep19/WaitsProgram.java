package Sep19;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class WaitsProgram {

    public static void main(String[] args) {

        WebDriver driver;
        driver= new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
        driver.findElement(By.xpath("//input[@id='name']")).click();
        System.out.println("this is implicit");
        driver.close();



        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='START']"))));
        driver.findElement(By.xpath("//button[text()='START']")).click();


        Wait<WebDriver> fluentwait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);


        WebElement element =  fluentwait.until(driverobj -> driverobj.findElement(By.xpath("//button[text()='STOP']")));
        element.click();

        WebElement element2 =  fluentwait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(By.xpath("//button[text()='Simple Alert']"));
            }
        });

        element2.click();


        List<WebElement> allbuttons =driver.findElements(By.xpath("//input"));
        //allbuttons.stream().forEach(n-> System.out.println(n.getText()));

        allbuttons.size();

for(WebElement button : allbuttons){
    System.out.println(button.getText());
}








    }
}
