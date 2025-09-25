package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //lokatori
    @FindBy(xpath = "//input[@name='login_user']")
    private WebElement usernameInputField;

    @FindBy(xpath = "//input[@name='login_pass']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//div/button[@type='submit']")
    private WebElement loginSubmitButton;


    //konstuktor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //metode
    public boolean isUsernameFieldDislayed() {
        return usernameInputField.isDisplayed();
    }

    public boolean isPasswordFieldDislayed() {
        return passwordInputField.isDisplayed();
    }

    public boolean isLoginButtonDislayed() {
        return loginSubmitButton.isDisplayed();
    }

}
