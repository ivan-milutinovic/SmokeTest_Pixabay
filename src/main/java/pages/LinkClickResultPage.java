package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkClickResultPage extends BasePage {

    //lokatori
    @FindBy(xpath = "//div[contains(@class, 'container')]//h1[contains(text(), 'Stunning royalty-free images')]")
    private WebElement mainHeader;

    //konstruktor
    public LinkClickResultPage(WebDriver driver) {
        super(driver);
    }

    //metode
    public String getHomePageTitle() {
        return getTextHandler(mainHeader);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void backToPreviousPage() {
        driver.navigate().back();
        waitForPageToLoad();
    }



}
