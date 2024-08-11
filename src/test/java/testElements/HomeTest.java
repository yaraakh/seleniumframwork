package testElements;

import findElements.Home;
import findElements.LogIn;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    Home homeObj4;
    @Test
    public void userCanChooseCat() throws InterruptedException {
        homeObj4 = new Home(driver);
        Thread.sleep(8000);
        homeObj4.chooseCat();
        Thread.sleep(8000);
        homeObj4.addTo();

    }

}
