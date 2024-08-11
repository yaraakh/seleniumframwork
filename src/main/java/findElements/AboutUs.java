package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUs extends Base{
    public AboutUs(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//*[@id='videoModal']/div/div/div[3]/button")
    WebElement closeAboutUs;
    public void CloseAboutUs(){

        closeAboutUs.click();
    }
}
