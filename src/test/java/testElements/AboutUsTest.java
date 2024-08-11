package testElements;

import findElements.AboutUs;
import findElements.Home;
import org.testng.annotations.Test;

public class AboutUsTest extends BaseTest{
    Home homeObj3;
    AboutUs aboutObj;
    @Test
    public void userCanLeanAboutUS() throws InterruptedException {
        homeObj3 = new Home(driver);
        homeObj3.AboutUs();
        Thread.sleep(8000);
        aboutObj = new AboutUs(driver);
        aboutObj.CloseAboutUs();

    }

}
