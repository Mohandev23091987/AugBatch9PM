package ScriptsFolder;


import PageObjectClasses.HomePage;
import Utility.DriverManager;
import org.openqa.selenium.WebDriver;

public class DataTableScripts {

    private int a;
    private int b;

    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://datatables.net/examples/data_sources/ajax.html");

//        HomePage homePageObj = new HomePage(driver);
//        homePageObj.clickOnManualTab();



    }




}
