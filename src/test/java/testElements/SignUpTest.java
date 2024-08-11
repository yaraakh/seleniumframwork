package testElements;

import findElements.Home;
import findElements.SignUp;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
    Home homeObj;
    SignUp signObj;
    @Test
    public void userCanSignUp(){
        homeObj = new Home(driver);
        signObj = new SignUp(driver);
        homeObj.SignUpHome();
        signObj.SignUp("ahmed12@gmail.com","ahmed1234");
    }
}
