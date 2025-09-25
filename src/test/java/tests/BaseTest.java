package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;

import java.time.Duration;

public abstract class BaseTest {

    protected static WebDriver driver;
    protected HomePage homePage;

   @BeforeClass
    public static void beforeAllTests() {
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
       driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(8));
   }

   @Before
    public void beforeEachTest() {
       driver.manage().deleteAllCookies();
   }

   @After
    public void afterEachTest() {
       driver.manage().deleteAllCookies();
   }

   @AfterClass
    public static void afterAllTests() {
       if (driver != null) {
           driver.quit();
       }
   }

}


