package pageObjects;

import Utility.WebUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class LoginPage {

    public void createAccount(WebDriver driver, String emailAddress, String first_Name, String last_Name, String address, String password, String City, String postalCode, String mobile_Phone, String address_Alias) {
        WebUtils.waitForElementVisible(driver, By.xpath("//a[@class='login']"));
        WebUtils.click(driver, By.xpath("//a[@class='login']"));
        fillEmailAddress(driver, emailAddress);
        WebUtils.waitForElementVisible(driver, By.xpath("//form[@id='account-creation_form']"));
        if (driver.findElement(By.xpath("//form[@id='account-creation_form'] ")).isDisplayed()) {
            registerForm(driver, emailAddress, first_Name, last_Name, address, password, City, postalCode, mobile_Phone, address_Alias);
            WebUtils.click(driver, By.xpath("//span[contains(text(),'Register')]"));
        }
    }

    public void fillEmailAddress(WebDriver driver, String emailAddress) {
        WebUtils.waitForElementVisible(driver, By.xpath("//input[@id='email_create']"));
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='email_create']"), emailAddress);
        WebUtils.click(driver, By.xpath("//form[@id='create-account_form']//span[1]"));
    }

    public void registerForm(WebDriver driver, String emailAddress, String first_Name, String last_Name, String address, String password, String City, String postalCode, String mobile_Phone, String address_Alias) {
        WebUtils.waitForElementVisible(driver, By.xpath("//input[@id='customer_firstname']"));
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='customer_firstname']"), first_Name);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='customer_lastname']"), last_Name);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='passwd']"), password);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='address1']"), address);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='city']"), City);
        Select stateDropdropdown = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
        stateDropdropdown.selectByIndex(1);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='postcode']"), postalCode);
        Select countryDropdropdown = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
        countryDropdropdown.selectByIndex(1);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='phone_mobile']"), mobile_Phone);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='alias']"), address_Alias);

    }

    public void loginWithCredentials(WebDriver driver, String userName, String password) {
        WebUtils.waitForElementVisible(driver, By.xpath("//a[@class='login']"));
        WebUtils.click(driver, By.xpath("//a[@class='login']"));
        WebUtils.waitForElementVisible(driver, By.xpath("//form[@id='login_form']"));
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='email']"), userName);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='passwd']"), password);
        WebUtils.click(driver, By.xpath("//p[@class='submit']//span[1]"));
    }

    public void addNewAddress(WebDriver driver, String emailAddress, String first_Name, String last_Name, String address, String password, String City, String postalCode, String mobile_Phone, String address_Alias) {
        WebUtils.waitForElementVisible(driver, By.xpath("//span[contains(text(),'My addresses')]"));
        WebUtils.click(driver, By.xpath("//span[contains(text(),'My addresses')]"));
        WebUtils.waitForElementVisible(driver, By.xpath("//span[contains(text(),'Add a new address')]"));
        WebUtils.click(driver, By.xpath("//span[contains(text(),'Add a new address')]"));
        updateForm(driver, emailAddress, first_Name, last_Name, address, password, City, postalCode, mobile_Phone, address_Alias);
        WebUtils.click(driver, By.xpath("//span[contains(text(),'Save')]"));
        WebUtils.waitForElementVisible(driver, By.xpath("//ul[@class='last_item alternate_item box']"));
        driver.findElement(By.xpath("//ul[@class='last_item alternate_item box']")).isDisplayed();
    }

    public void updateForm(WebDriver driver, String emailAddress, String first_Name, String last_Name, String address, String password, String City, String postalCode, String mobile_Phone, String address_Alias) {
        WebUtils.waitForElementVisible(driver, By.xpath("//input[@id='firstname']"));
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='firstname']"), first_Name);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='lastname']"), last_Name);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='address1']"), address);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='city']"), City);
        Select stateDropdropdown = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
        stateDropdropdown.selectByIndex(1);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='postcode']"), postalCode);
        Select countryDropdropdown = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
        countryDropdropdown.selectByIndex(0);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='phone_mobile']"), mobile_Phone);
        WebUtils.clearAndSendKeys(driver, By.xpath("//input[@id='alias']"), address_Alias);
    }

    public void navigateToWomansSubMenu(WebDriver driver) throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(4000);

        WebElement subMenuOption = driver.findElement(By.xpath("//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]"));
        //Mouse hover menuOption 'Rock'
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(5000);
        By by = By.xpath("//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]");
        retryingFindClick(driver, by);


    }

    public boolean retryingFindClick(WebDriver driver, By by) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 5) {
            try {
                driver.findElement(by).click();
                result = true;
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        return result;
    }

    public void changeToListView(WebDriver driver) throws InterruptedException {
        WebUtils.waitForElementVisible(driver, By.xpath("//span[@class='cat-name']"));
        WebUtils.click(driver, By.xpath("//li[@id='list']//i[1]"));
        Thread.sleep(3000);
    }

    public void addTheFirstItem(WebDriver driver) throws InterruptedException {
        WebUtils.waitForElementVisible(driver, By.xpath("//li[@class='ajax_block_product first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line col-xs-12']//span[contains(text(),'Add to cart')]"));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//li[@class='ajax_block_product first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line col-xs-12']//span[contains(text(),'Add to cart')]"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(4000);

        WebUtils.waitForElementVisible(driver, By.xpath("(//span[text()='Quick view'])[1]"));
        WebUtils.click(driver, By.xpath("(//span[text()='Quick view'])[1]"));
        Thread.sleep(12000);
    }

    public void increaseTheQuantityItem(WebDriver driver) throws InterruptedException {
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Frame size" + size);
        driver.switchTo().frame(0);
        WebUtils.waitForElementVisible(driver, By.xpath("//input[@id='quantity_wanted']"));
        By byVa = By.xpath("//input[@id='quantity_wanted']");
        WebUtils.clearAndSendKeys(driver, byVa, "5");
        Select sizeDropDown = new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
        sizeDropDown.selectByIndex(2);
        WebElement color = driver.findElement(By.className("color_pick"));
        color.click();
        Thread.sleep(2000);
        WebUtils.waitForElementVisible(driver, By.xpath("//span[text()='Add to cart']"));
        WebUtils.click(driver, By.xpath("//span[text()='Add to cart']"));
        Thread.sleep(2000);
        WebUtils.waitForElementVisible(driver, By.xpath("//div[@class='button-container']"));
        Thread.sleep(10000);
        WebUtils.waitForElementVisible(driver, By.xpath("//span[contains(text(),'Proceed to checkout')]"));
        WebUtils.click(driver, By.xpath("//span[contains(text(),'Proceed to checkout')]"));
        WebUtils.waitForElementVisible(driver, By.xpath("//h1[@id='cart_title']"));
        WebUtils.waitForElementVisible(driver, By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"));
        WebUtils.click(driver, By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"));

        WebUtils.waitForElementVisible(driver, By.xpath("//label[contains(text(),'Choose a delivery address:')]"));
        WebUtils.click(driver, By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"));
        WebUtils.waitForElementVisible(driver, By.xpath("//div[@class='order_carrier_content box']"));
        Thread.sleep(5000);
        By by = By.xpath("//input[@id='cgv']");
        Thread.sleep(5000);
        retryingFindClick(driver, by);
        Thread.sleep(5000);
        WebUtils.click(driver, By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"));
        WebUtils.waitForElementVisible(driver, By.xpath("//a[@class='bankwire']"));
        WebUtils.click(driver, By.className("bankwire"));
        WebUtils.waitForElementVisible(driver, By.xpath("//span[contains(text(),'I confirm my order')]"));
        WebUtils.click(driver, By.xpath("//span[contains(text(),'I confirm my order')]"));
        WebUtils.waitForElementVisible(driver, By.xpath("//div[@class='box']"));
    }

    public void orderHistoryDetails(WebDriver driver) throws InterruptedException {
        WebUtils.waitForElementVisible(driver, By.xpath("//span[contains(text(),'Elavarasan Srinivasan')]"));
        WebUtils.click(driver, By.xpath("//span[contains(text(),'Elavarasan Srinivasan')]"));
        WebUtils.waitForElementVisible(driver, By.xpath("//span[contains(text(),'Order history and details')]"));
        WebUtils.click(driver, By.xpath("//span[contains(text(),'Order history and details')]"));
        Thread.sleep(3000);
        WebUtils.waitForElementVisible(driver, By.xpath("//table[@id='order-list']"));
        driver.findElement(By.xpath("//table[@id='order-list']")).isDisplayed();
    }

    public void captureScreenShot(WebDriver driver) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:/Automation/OrderHisTory.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void signOut(WebDriver driver) throws InterruptedException {
        WebUtils.waitForElementVisible(driver, By.xpath("//a[@class='logout']"));
        Thread.sleep(3000);
        WebUtils.click(driver, By.xpath("//a[@class='logout']"));
    }

}
