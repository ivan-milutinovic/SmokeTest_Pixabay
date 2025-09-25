package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected final WebDriverWait wait;
    protected final Actions actions;
    protected final JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    //metode
    public void waitForPageToLoad() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForJQueryAndJS() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //cekanje da se jQuery ucita
        js.executeScript("return typeof jQuery != 'undefined' && jQuery.active == 0");

        //cekanje da se JavaScript ucita
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    protected void clickByJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    //metode
    protected WebElement isClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement isVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    //e-hendleri
    protected void clickHandler(WebElement element) {
        isClickable(element);
        element.click();
    }

    protected void sendKeysHandler(WebElement element, String text) {
        isVisible(element);
        element.sendKeys(text);
    }


    protected String getTextHandler(WebElement element) {
        WebElement el = isVisible(element);
        return el.getText();
    }



}


