package Sep22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CloseWindowExceptOne {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.hackerearth.com/windows");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();


        for(String window : driver.getWindowHandles()){
            driver.switchTo().window(window);
            if(driver.getTitle().equals("New Window")){
                driver.close();
            }

        }



    }


}
