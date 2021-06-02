package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waiter {
    private WebDriver driver;

    public Waiter(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToAppear (WebElement webElement) {
        new WebDriverWait(this.driver, 10).until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForPageToLoadCompletely () {
        new WebDriverWait(this.driver, 40)
                .until(webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState")
                        .equals("complete"));
    }

    public void waitCertainAmountOfTime (int time) { this.driver.manage().timeouts().implicitlyWait(time, TimeUnit.MILLISECONDS); }

    public void acceptCookies () {
        new WebDriverWait(this.driver, 40)
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/button[2]")))).click();
    }
}