package findElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;
    public JavascriptExecutor jse;


    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void scrollToBottom() {
        jse.executeScript("scrollBy(0,2500)");
    }
}
