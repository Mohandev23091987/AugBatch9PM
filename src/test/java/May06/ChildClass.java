package May06;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ChildClass extends ParentClass {

    public void sum(int a, int b){
        System.out.println("it is from child"+(a+b+10));
    }

    public void div(int a, int b){
        System.out.println("it is from child"+(a/b));
    }


    public static void main(String[] args) {

        //1 normal child calss creation
        ChildClass childObj = new ChildClass();
        childObj.sum(10,20); //40

        ParentClass parentrefVariable = new ChildClass();
        //WebDriver driver;



        //driver = new ChromeDriver();

        //unique methods from parent and
        // overidden methods in child
        // you cannot access unique methods in child

        parentrefVariable.sum(10,20); //40
        ChildClass childObj1 = (ChildClass)parentrefVariable;



        childObj1.div(40,10);
        WebDriver driver = new ChromeDriver();
        driver.get("url");
        File Screenshot =((ChromeDriver) driver).getScreenshotAs(OutputType.FILE);






    }



}
