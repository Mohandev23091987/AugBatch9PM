package ScriptClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("Before method");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
}
