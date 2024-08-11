package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends Base{
    public Cart(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[6]/div/div[2]/button")
    WebElement placeOrder;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[1]/input")
    WebElement nameOrder;
    @FindBy(xpath = "//*[@id=\"country\"]")
    WebElement nameCountry;
    @FindBy(id = "city")
    WebElement nameCity;
    @FindBy(id = "card")
    WebElement cardID;
    @FindBy(id = "month")
    WebElement month;
    @FindBy(id = "year")
    WebElement year;
    @FindBy(xpath = "//*[@id='orderModal']/div/div/div[3]/button[2]")
    WebElement purchase;
    public void PlaceOrder(String na ,String co , String ci ,String ca ,String mo,String y){
        placeOrder.click();
        nameOrder.sendKeys(na);
        nameCountry.sendKeys(co);
        nameCity.sendKeys(ci);
        cardID.sendKeys(ca);
        month.sendKeys(mo);
        year.sendKeys(y);
        purchase.click();


    }




}
