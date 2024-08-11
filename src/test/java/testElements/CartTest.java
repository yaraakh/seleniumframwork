package testElements;

import findElements.Cart;
import findElements.Home;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
    Home homeObj5;
    Cart cartObj;
    @Test
    public void userCanPlaceOrder() throws InterruptedException {
        homeObj5 = new Home(driver);
        cartObj = new Cart(driver);
        Thread.sleep(8000);
        homeObj5.EnterCart();
        Thread.sleep(5000);

        cartObj.PlaceOrder("yara","Egypt","Benha","1211","12","1");
    }

}
