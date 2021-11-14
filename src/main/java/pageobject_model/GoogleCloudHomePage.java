package pageobject_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;

public class GoogleCloudHomePage extends AbstractPage{

    private final String HOME_PAGE_URL = "https://cloud.google.com/";

    @FindBy(xpath = "//div[@class='devsite-searchbox']/input")
    private WebElement search;

    public GoogleCloudHomePage(WebDriver driver) {
        super(driver);
    }

    public GoogleSearchPage search() {
        search.sendKeys("Google Cloud Platform Pricing Calculator");
        search.sendKeys(Keys.ENTER);
        return new GoogleSearchPage(driver);
    }

    public GoogleCloudHomePage openPage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }
}
