package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact extends Base{
    public Contact(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "recipient-email")
    WebElement contactEmail;
    @FindBy(id = "recipient-name")
    WebElement contactName;
    @FindBy (id ="message-text")
    WebElement message;
    @FindBy (xpath ="//*[@id='exampleModal']/div/div/div[3]/button[2]")
    WebElement SendMessage;
    public void Contact(String c_e,String c_n,String c_m){
        contactEmail.sendKeys(c_e);
        contactName.sendKeys(c_n);
        message.sendKeys(c_m);
        SendMessage.click();
    }
}
