package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ImagePage;
import pages.SearchResultPage;

public class ImageDownloadTest extends BaseTest {

    //konstante
    protected final String query = "Forest";

    @Test
    public void verifyDownloadButtonIsPresent() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.search(query);

        SearchResultPage searchResultPage = new SearchResultPage(driver, query);
        searchResultPage.clickFirstImage();

        ImagePage imagePage = new ImagePage(driver);
        Assert.assertTrue("Dugme za preuzimanje nije pronadjeno", imagePage.isDownloadButtonDisplayed());


    }

}
