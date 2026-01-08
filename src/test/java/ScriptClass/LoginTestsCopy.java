package ScriptClass;

import org.testng.annotations.*;

public class LoginTestsCopy extends BaseTest {


//grouping

    @Test(priority =3, groups ={"smoke","P1"})
    public void aloginWithValidCredentails(){
        System.out.println("aloginWithValidCredentails");
        //create page class object
        //by using page classes objects you are going to call methods

    }


    @Test(priority =2,groups ={"Regression","P2"})
    public void loginWithValidCredentails(){
        System.out.println("loginWithValidCredentails");
        //create page class object
        //by using page classes objects you are going to call methods

    }

    @Parameters({"browser","username","password"})
    @Test(priority =1,groups ={"ParameterScrpt","P2"})
    public void loginWithWrongCredentails(String browserName, String username,String pwd){
        System.out.println("loginWithWrongCredentails");
        System.out.println(browserName + ":"+ username+ ":"+pwd);
    }



    @Test (priority =0)
    public void validateLoginPage(){
        System.out.println("validateLoginPage");
    }


    @DataProvider (name ="loginData")
    public Object[][] loginDataProvider(){

        Object[][] loginDatapro = {
                {"admin","12345","Test"} ,
                {"ReadUser","12345","Stage"} ,
                {"DeleteUser","12345","production"}
        };

        return loginDatapro;
    }



    @Test(dataProvider="loginData",groups ={"DataproviderTest","P2"})
    public void loginTest(String userName,String pwd,String env){

        System.out.println(userName + ": "+pwd + ":"+env);

    }












}
