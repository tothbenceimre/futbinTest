package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Waiter;

public class MainPage {
    WebDriver driver;
    Waiter waiter;

    public MainPage (WebDriver driver) {
        this.driver = driver;
        this.waiter = new Waiter(this.driver);
        PageFactory.initElements(this.driver, this);
    }
}
