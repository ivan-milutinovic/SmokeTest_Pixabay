package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.SearchResultPage;

public class SearchTest extends BaseTest {

    //konstante
    protected final String query = "Forest";

    @Test
    public void verifySearchResult() {
        homePage = new HomePage(driver);

        homePage.openPage();
        homePage.search(query);

        SearchResultPage searchResultPage = new SearchResultPage(driver, query);

        //verifikacija naslova
        String actualHeader = searchResultPage.getHomePageTitle();
        Assert.assertTrue("Naslov ne sadrzi trazeni pojam.", actualHeader.contains(query));

        //verifikacija url
        String actualUrl = searchResultPage.getUrl().toString();
        Assert.assertTrue("Url ne sadrzi trazeni pojam.", actualUrl.contains(query.toLowerCase()));

        //verifikacija rezultata
        Assert.assertTrue("Nema rezultata pretrage", searchResultPage.getNumberOfResults() > 0);
    }

}


