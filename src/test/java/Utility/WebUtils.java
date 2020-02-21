package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {
    static WebDriver driver = null;

    public static WebDriver launchTheBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void waitForElementVisible(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void click(WebDriver driver, By by) {
        waitForElementVisible(driver, by);
        driver.findElement(by).click();
    }

    public static void clearAndSendKeys(WebDriver driver, By by, String value) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(value);
    }
}
