package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginFieldsExist() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue("Username polje nije pronadjeno", loginPage.isUsernameFieldDislayed());

        Assert.assertTrue("Password polje nije pronadjeno", loginPage.isPasswordFieldDislayed());

        Assert.assertTrue("Login dugme nije pronadjeno", loginPage.isLoginButtonDislayed());

    }

}