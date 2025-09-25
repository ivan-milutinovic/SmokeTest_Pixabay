package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage {

    //konstante
    String url = "https://pixabay.com/";

    //lokatori
    @FindBy(xpath = "//div[contains(@class, 'container')]//h1[contains(text(), 'Stunning royalty-free images')]")
    private WebElement mainHeader;

    @FindBy(xpath = "//div[contains(@class, 'container')]//picture")
    public WebElement backgroundImage;

    @FindBy(xpath = "//input[contains(@name, 'search')]")
    private WebElement inputField;

//    @FindBy(xpath = "//button[contains(@type, 'submit')]")
//    private WebElement submitInputField;

    @FindBy(xpath = "//div[contains(@class, 'desktopOnly')]/button[contains(@class, 'ghost')]")
    private WebElement loginLink;

    @FindBy(xpath = "//div[contains(@class, 'containerOuter')]/div/div/a")
    private List<WebElement> allNavLinks;

    //konstruktor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //metode
    public void openPage() {
        driver.get(url);
        waitForPageToLoad();
        waitForJQueryAndJS();
    }

    public String getHomePageTitle() {
        return getTextHandler(mainHeader);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void search(String query) {
        //PROBLEM!!!!!!!
//        clickHandler(inputField);
//        sendKeysHandler(inputField, query);
//        clickHandler(inputField);
//        clickHandler(submitInputField);

        //neprekidna sekvenca akcija
        actions.moveToElement(inputField)
                .pause(Duration.ofMillis(2500))
                .click()
                .sendKeys(query)
                .sendKeys(Keys.ENTER)
                .perform();
        waitForPageToLoad();
        waitForJQueryAndJS();
    }

    public void clickLoginButton() {
        actions.moveToElement(loginLink)
                .pause(Duration.ofMillis(2500))
                .click()
                .perform();
        waitForPageToLoad();
        waitForJQueryAndJS();
    }

    public List<WebElement> getAllNavLinks() {
        return allNavLinks;
    }

    public int getNumberOfNavLinks() {
        return allNavLinks.size();
    }

    public void clickNavLink(WebElement element) {
        actions.moveToElement(element)
                .pause(Duration.ofMillis(1000))
                .click()
                .perform();
        waitForPageToLoad();
        waitForJQueryAndJS();
    }

}


