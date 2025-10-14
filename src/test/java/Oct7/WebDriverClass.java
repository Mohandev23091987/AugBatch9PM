package Oct7;

import Oct6.SingleTonPattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverClass {

    // 1)private static instance of class
    private static volatile WebDriverClass instance; //object
    private static ThreadLocal<WebDriver> drivertl = new ThreadLocal<>();

    //3threads - new ChromeDriver()
    //3 threads - new ChromeDriver(), new ChromeDriver(),new ChromeDriver()

    //2.Create private constructor
    private WebDriverClass(){

    }

    private void initDriver(String browser){
        switch (browser){
            case "chrome":
                drivertl.set(new ChromeDriver()) ;
                break;
            case "edge":
                drivertl.set(new EdgeDriver()) ;
                break;
            case "firefox":
                drivertl.set(new FirefoxDriver()) ;
                break;
            default:
                throw new IllegalArgumentException(" Please provide correct browser currently you are providing:"+browser);
        }
    }

    //3)public static method to provide access to object to other classes

    public static WebDriverClass getInstance(String browser){

        if(instance==null){
            synchronized (WebDriverClass.class){
                if(instance==null){
                    instance = new WebDriverClass();
                }
            }
        }

       if(drivertl.get()==null){
           instance.initDriver(browser);
       }
       return instance;

    }


    public WebDriver  getDriver(){
        return drivertl.get();
    }

   public static void closeBrowsers(){

        if(drivertl.get()!=null){
            drivertl.get().quit();
            drivertl.remove();
        }

   }




}
