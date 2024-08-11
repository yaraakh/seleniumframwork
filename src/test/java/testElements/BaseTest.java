package testElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;
    @BeforeSuite

    public void SetUpDriver() throws InterruptedException {


        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(8000);

    }
}
