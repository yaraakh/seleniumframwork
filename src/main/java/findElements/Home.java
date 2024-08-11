package findElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base{
    public Home(WebDriver driver) {
        super(driver);
        jse= (JavascriptExecutor) driver;

    }
    @FindBy(id = "signin2")
    WebElement signUpHome;
    @FindBy(id = "login2")
    WebElement logInHome;
    @FindBy(xpath = "//*[@id='navbarExample']/ul/li[2]/a")
    WebElement contact;
    @FindBy(xpath = "//*[@id='navbarExample']/ul/li[3]/a")
    WebElement aboutUs;
    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[2]")
    WebElement phones;
    @FindBy(xpath = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement cat;
    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/a")
    WebElement addToCart;
    @FindBy(id = "cartur")
    WebElement cart;
    public void SignUpHome() {
        signUpHome.click();
    }
     public void LogInHome(){
            logInHome.click();

    }
    public void ContactHome(){
        contact.click();

    }
    public void AboutUs() {
        aboutUs.click();
    }
    public void chooseCat(){
        phones.click();
        cat.click();

    }
    public void addTo(){
        addToCart.click();

    }
    public void EnterCart() {
        cart.click();
    }

}
