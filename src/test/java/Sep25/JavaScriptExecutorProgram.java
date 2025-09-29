package Sep25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorProgram {

    static int sum (int number){
        System.out.println("number is "+number);
        return number+30;
    }

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.hackerearth.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement inputsLink = driver.findElement(By.xpath("//a[text()='Inputs']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",inputsLink);



        js.executeScript("arguments[0].value='123'",driver.findElement(By.xpath("//input[@type='number']")));

        //refresh
        js.executeScript("history.back();");
        js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//a[text()='Typos']")));

        //js.executeScript("arguments[0].style.border='3px solid red'",driver.findElement(By.xpath("//a[text()='Typos']")));

        js.executeScript("arguments[0].style.backgroundColor='red'",driver.findElement(By.xpath("//a[text()='Typos']")));
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight);");


        int x=10;

        int y = sum(x);

        System.out.println(y);

        js.executeScript("window.close();");

        String urlOfThePage = js.executeScript("return document.URL").toString();

        System.out.println(urlOfThePage);












    }






}
