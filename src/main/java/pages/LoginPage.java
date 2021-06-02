package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.UtilDriver;
import util.Waiter;

public class LoginPage {
    WebDriver driver;
    Waiter waiter;

    @FindBy (id = "Email") WebElement username;
    @FindBy (id = "Password") WebElement password;
    @FindBy (xpath = "//button[normalize-space()='Login']") WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new Waiter(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    public void fillUsernameField (String username) {
        this.username.sendKeys(username);
    }

    public void fillPasswordField (String password) {
        this.password.sendKeys(password);
    }

    public void logIn (String username, String password) {
        fillUsernameField(username);
        fillPasswordField(password);
        clickOnLoginButton();
    }

    public void clickOnLoginButton () {
        this.loginButton.click();
    }
}
