package testElements;

import findElements.Home;
import findElements.LogIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{

    Home homeObj1;
    LogIn logObj;
    @Test
    public void userCanLogIn() throws InterruptedException {
        homeObj1 = new Home(driver);
        logObj = new LogIn(driver);
        homeObj1.LogInHome();
        logObj.LogIn("ahmed12@gmail.com","ahmed1234");
        Thread.sleep(8000);

        Assert.assertTrue(logObj.successMessage.getText().contains("Welcome"));
    }
}
