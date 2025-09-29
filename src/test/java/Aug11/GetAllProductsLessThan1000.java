package Aug11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllProductsLessThan1000 {

    //span[@class="plp-price__integer" and text()<1000]/ancestor::div[@class="plp-mastercard__item plp-mastercard__price "]/descendant::span[@class="notranslate plp-price-module__product-name"]
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.get("https://www.ikea.com/in/en/search/?q=lamp");

        List<WebElement> allProducts =   driver.findElements(By.xpath("//span[@class=\"plp-price__integer\" and text()<1000]/ancestor::div[@class=\"plp-mastercard__item plp-mastercard__price \"]/descendant::span[@class=\"notranslate plp-price-module__product-name\"]"));

        System.out.println(allProducts.size());
        for(WebElement product : allProducts){
            WebElement productNameWebElement =  product;
           WebElement priceWebElement = productNameWebElement.findElement(By.xpath("(.//following::span[@class='plp-price__integer'])[1]"));



        }














    }
}
