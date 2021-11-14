import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.GoogleCalculatorPage;
import pageobject_model.GoogleCloudHomePage;
import pageobject_model.GoogleSearchPage;

public class GoogleCloudTest {

    private WebDriver driver;

    @BeforeMethod
    private void initializeBrowser() {
        driver = new ChromeDriver();
        GoogleCalculatorPage page = new GoogleCloudHomePage(driver)
                .openPage()
                .search()
                .clickSearchResult()
                .computeEngineTab();
    }

    @Test


    @AfterMethod
    private void closeBrowser() {
        driver.quit();
        driver = null;
    }

}
