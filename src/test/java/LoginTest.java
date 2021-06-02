import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;
import util.UtilDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    UtilDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    ProfilePage profilePage;

    @BeforeEach
    public void setup () {
        this.driver = new UtilDriver();
        this.mainPage = new MainPage(this.driver.getDriver());
        this.loginPage = new LoginPage(this.driver.getDriver());
        this.profilePage = new ProfilePage(this.driver.getDriver());
    }

    @Test
    public void loginTest_loginFromLoginPage_isWorking () {
        this.mainPage.clickOnLoginButton();
        this.loginPage.logIn(System.getenv("FutbinUsername"), System.getenv("FutbinPassword"));
        this.driver.navigation(this.driver.getProfileUrl(System.getenv("FutbinUsername")));

        assertTrue(this.profilePage.verifyUsernameIsCorrect(System.getenv("FutbinUsername")));
    }
}
