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
        this.waiter.waitForPageToLoadCompletely();
        this.waiter.waitCertainAmountOfTime(20);
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void close(){
        driver.close();
    }

    public void navigation (String url) {
        this.waiter.waitCertainAmountOfTime(1000000);
        driver.get(url);
    }

}
