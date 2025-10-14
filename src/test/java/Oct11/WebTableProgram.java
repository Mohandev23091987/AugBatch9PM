package Oct11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTableProgram {

    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");


        WebElement table = driver.findElement(By.xpath("//table[@id='taskTable']"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

//        for(WebElement row : rows){
//                List<WebElement> allColumns = row.findElements(By.tagName("td"));
//                for(WebElement cell:allColumns){
//                    System.out.print(cell.getText()+ "\t");
//                }
//                System.out.println();
//        }

        for(WebElement row : rows){
            System.out.println(row.getText());
        }









    }



}
