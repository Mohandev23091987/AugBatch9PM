package Oct11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebtableDynamicCellHandling {





    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

       String price = driver.findElement(By.xpath("//table[@id='productTable']//td[text()='Laptop']/following-sibling::td[1]")).getText();
        System.out.println(price);
        driver.findElement(By.xpath("//table[@id='productTable']//td[text()='Laptop']/parent::tr/descendant::input")).click();
        ////table[@id='productTable']//td[text()='Laptop']/parent::tr/descendant::input
        ////table[@id='productTable']//td[text()='Laptop']/following-sibling::td[2]/input

        List<WebElement> allProducts = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));

                for(WebElement productNameEle:allProducts) {
                    System.out.println(productNameEle.getText());
                }




        for(WebElement product : driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"))){
            System.out.println(product.getText());
        }


        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));





                for(WebElement row : rows){
                    System.out.println(row.findElements(By.tagName("td")).size());
                 }


         int rowNumber =4;
          WebElement WebTable = driver.findElement(By.xpath("//table[@id='taskTable']"));

        System.out.println(WebTable.findElements(By.xpath("./tbody/tr["+rowNumber+"]/td")).size());






    }
}
