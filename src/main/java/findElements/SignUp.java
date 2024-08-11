package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends Base{
    public SignUp(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "sign-username")
    WebElement userName;
    @FindBy(id = "sign-password")
    WebElement password;
    @FindBy (xpath ="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    WebElement signUp;
    public void SignUp(String E,String P){
        userName.sendKeys(E);
        password.sendKeys(P);
        signUp.click();
    }
}
