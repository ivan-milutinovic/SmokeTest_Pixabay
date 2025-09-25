package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;

public class EnvironmentInfo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

            System.out.println("=== ENVIRONMENT INFO ===");
            System.out.println("Browser: " + caps.getBrowserName());
            System.out.println("Browser Version: " + caps.getBrowserVersion());
            System.out.println("ChromeDriver Version: " + caps.getCapability("chromeDriverVersion"));
            System.out.println("Platform: " + caps.getPlatformName());

            // Selenium verzija
            Package pkg = RemoteWebDriver.class.getPackage();
            System.out.println("Selenium Version: " + pkg.getImplementationVersion());

        } catch (Exception e) {
            System.out.println("Error getting version info: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}