package Sep22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultipleWindows {

    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.hackerearth.com/windows");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();


 Set<String> allWindows = driver.getWindowHandles();
//       Iterator<String> itr =  allWindows.iterator();
//
//       String parent = itr.next();
//       String child = itr.next();
 //       driver.switchTo().window(child);

//        for( String window: allWindows){
//
//            if(!window.equals(parentWindow)){
//                driver.switchTo().window(window);
//            }
//        }

        //convert set into list
        List<String>  windowList = new ArrayList<>(allWindows);
        System.out.println(windowList);
        driver.switchTo().window(windowList.get(1));
        System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());





    }


}
