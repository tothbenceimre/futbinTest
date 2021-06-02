package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilDriver {
    private WebDriver driver;
    private Waiter waiter;

    public UtilDriver() {
        this.driver = new ChromeDriver();
        this.waiter = new Waiter(this.driver);
        this.navigation(this.getBaseUrl());
        this.waiter.acceptCookies();
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

    public String getBaseUrl () {
        return "https://www.futbin.com/";
    }

    public String getProfileUrl (String username) {
        return this.getBaseUrl() + "/community/user/" + username;
    }
}
