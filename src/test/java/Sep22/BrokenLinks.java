package Sep22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.deadlinkcity.com/");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

       List<WebElement> allLinks = driver.findElements(By.tagName("a"));


       for( WebElement link: allLinks){
           String hrefLink = link.getAttribute("href");  //error-page.asp?e=401
           if(hrefLink==null || hrefLink.isEmpty())
               continue;
           URL urlobj = new URL(hrefLink);  // www.error-page.asp?e=401.com
           HttpURLConnection httpCon = (HttpURLConnection)urlobj.openConnection(); //https://www.error-page.asp?e=401.com
           httpCon.connect(); //calling the api server
           if(httpCon.getResponseCode() >=400)
               System.out.println("its a broken link: " + hrefLink + "status code is :"+ httpCon.getResponseCode());

       }






    }
}
