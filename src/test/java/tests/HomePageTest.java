package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Before
    public void beforeEachTest() {
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyPageH1Tag() {
        homePage.openPage();
        String expectedH1TagText = "Stunning royalty-free images & royalty-free stock";
        String actualH1TagText = homePage.getHomePageTitle();
        Assert.assertTrue("H1 tag sadrzi pogresan tekst", actualH1TagText.equals(expectedH1TagText));
    }

    @Test
    public void verifyBackgroundImage() {
        homePage.openPage();
        Assert.assertTrue("Background Image nije pronadjen.", homePage.backgroundImage.isDisplayed());
    }

    @Test
    public void verifyUrl() {
        homePage.openPage();
        String expectedUrl = "https://pixabay.com/";
        String actualUrl = homePage.getUrl();
        Assert.assertTrue("Url adresa nije odgovarajuca.", actualUrl.equals(expectedUrl));
    }


}

