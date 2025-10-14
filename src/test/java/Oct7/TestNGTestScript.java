package Oct7;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTestScript {

    private WebDriver driver;


    @BeforeClass
    @Parameters("browser")
    public void setUpBrowser(String browser){
        driver = WebDriverClass.getInstance(browser).getDriver();
        System.out.println("==================="+WebDriverClass.getInstance(browser).hashCode()+"=============");
    }


    @Test
    public void launchUrl(){
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.11.0");
        System.out.println(Thread.currentThread().getName()  + ":"+Thread.currentThread().getId() );
    }


//    @AfterClass
//    public void tearDown(){
//        WebDriverClass.closeBrowsers();
//    }



}
