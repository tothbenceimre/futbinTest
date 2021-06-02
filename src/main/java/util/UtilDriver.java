package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilDriver {
    private WebDriver driver;
    private String baseUrl;
    private Waiter waiter;

    public UtilDriver() {
        this.driver = new ChromeDriver();
        this.waiter = new Waiter(this.driver);
        this.baseUrl = "https://www.futbin.com/";
        this.driver.get(this.baseUrl);
        this.waiter.waitForPageToLoadCompletely();
        this.waiter.waitCertainAmountOfTime(20);
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void close(){
        driver.close();
    }

    public void navigation (String url) {
        driver.get(url);
    }

    public String getProfileUrl (String username) {
        return this.baseUrl + "/community/user/" + username;
    }
}
