package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Waiter;

import java.util.Locale;

public class ProfilePage {
    WebDriver driver;
    Waiter waiter;

    @FindBy (xpath = "//div[@class='username-header pl-3']") WebElement username;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new Waiter(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    public boolean verifyUsernameIsCorrect (String username) {
        System.out.println(this.username.getText());
        return this.username.getText().equals(username.toUpperCase());
    }
}
