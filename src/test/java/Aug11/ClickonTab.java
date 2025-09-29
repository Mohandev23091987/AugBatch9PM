package Aug11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonTab {

    static WebDriver driver;

    ClickonTab(){
        System.out.println("mohan constructor");
    }

    ClickonTab(int a){
        System.out.println("mohan constructor"+a);
    }




    void clickOnTab(String tabName){

        driver.findElement(By.xpath("//a[text()='"+tabName+"' and @class='nav-a  ']")).click();
    }



    public static void main(String[] args) throws InterruptedException {


         driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.get("https://www.amazon.in/");

        ClickonTab obj = new ClickonTab();

        obj.clickOnTab("Sell");









    }
}

// write a program
//cd
//javac

