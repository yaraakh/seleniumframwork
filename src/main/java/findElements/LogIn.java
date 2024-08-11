package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends Base{
    public LogIn(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "loginusername")
    WebElement l_userName;
    @FindBy(id = "loginpassword")
    WebElement l_password;
    @FindBy (xpath ="//*[@id='logInModal']/div/div/div[3]/button[2]")
    WebElement logIn;
    @FindBy(id = "nameofuser")
    public WebElement successMessage;
    public void LogIn(String e,String p){
        l_userName.sendKeys(e);
        l_password.sendKeys(p);
        logIn.click();
    }

}
