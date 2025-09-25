package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LinkClickResultPage;

import java.util.List;

public class NavigationLinksTest extends BaseTest {

    @Before
    public void beforeEachTest() {
        homePage = new HomePage(driver);
    }


    @Test
    public void verifyAllNavigationLinksArePresent() {
        homePage.openPage();

        //provera linkova navigacije
        Assert.assertTrue("Nisu pronadjeni svi linkovi", homePage.getNumberOfNavLinks() == 22);
    }

    @Test
    public void verifyAllNavigationLinksAreWorking() {
        homePage.openPage();

        int numberOfLinks = homePage.getNumberOfNavLinks();

        for (int i = 1; i < numberOfLinks - 18; i++) {
            List<WebElement> links = homePage.getAllNavLinks();
            WebElement linkToTest = links.get(i);
            String linkTest = linkToTest.getText().toLowerCase();

            homePage.clickNavLink(linkToTest);
            homePage.waitForPageToLoad();

            LinkClickResultPage linkClickResultPage = new LinkClickResultPage(driver);

            String newUrl = linkClickResultPage.getUrl();

            Assert.assertTrue("Url ne sadrzi trazeni pojam: " + linkTest, newUrl.contains(linkTest));

            linkClickResultPage.backToPreviousPage();

        }

    }

}
