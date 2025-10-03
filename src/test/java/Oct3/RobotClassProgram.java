package Oct3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RobotClassProgram {

    public static void main(String[] args) throws AWTException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.hackerearth.com/upload");

        JavascriptExecutor js = (JavascriptExecutor)driver;

       WebElement upload = driver.findElement(By.xpath("//*[@id='file-upload']"));

               js.executeScript("arguments[0].click();",upload);

        StringSelection selection = new StringSelection("C:\\Users\\Mohan Dev\\OneDrive\\Desktop\\LambdaExpressionsPrograms.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        Robot robot = new Robot();

        //simulate keyboard actions
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);


        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);














    }

}
