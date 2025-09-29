package XpathAndXpathAxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class FirstProgram {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        List<WebElement> allTabs =driver.findElements(By.cssSelector("[class='nav-a  ']"));

         for(WebElement tab : allTabs ){

             System.out.println(tab.getText());
         }



    }
}
