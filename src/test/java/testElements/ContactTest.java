package testElements;

import findElements.Contact;
import findElements.Home;
import findElements.LogIn;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest{
    Home homeObj2;
    Contact contactObj;
    @Test
    public void userCanContact(){
        homeObj2 = new Home(driver);
        contactObj = new Contact(driver);
        homeObj2.ContactHome();
        contactObj.Contact("ahmed12@gmail.com","ahmed","HELLO");
    }
}
