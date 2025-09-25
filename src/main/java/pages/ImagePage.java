package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImagePage extends BasePage {

    //lokatori
    @FindBy(xpath = "//button[contains(@class, 'fullWidthTrigger')]")
    private WebElement downloadButton;

    //konstruktor
    public ImagePage(WebDriver driver) {
        super(driver);
    }

    //metode
    public boolean isDownloadButtonDisplayed() {
        return isVisible(downloadButton).isDisplayed();
    }



}


