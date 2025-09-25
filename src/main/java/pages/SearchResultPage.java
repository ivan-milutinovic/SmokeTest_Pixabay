package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultPage extends BasePage {

    //konstante

    //lokatori
    @FindBy(xpath = "//div[contains(@id, 'app')]/div/div//h1[contains(@class, 'h1')]")
    private WebElement mainHeader;

    @FindBy(xpath = "//div[contains(@class, 'result')]//div[contains(@class, 'cell')]")
    private List<WebElement> searchResults;

    public SearchResultPage(WebDriver driver, String query) {
        super(driver);
        wait.until(ExpectedConditions.textToBePresentInElement(mainHeader, query));
    }

    //metode
    public String getHomePageTitle() {
        return getTextHandler(mainHeader);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public int getNumberOfResults() {
        return searchResults.size();
    }

    public void clickFirstImage() {
        if (!searchResults.isEmpty()) {
            clickHandler(searchResults.get(0));
        }
    }



}


