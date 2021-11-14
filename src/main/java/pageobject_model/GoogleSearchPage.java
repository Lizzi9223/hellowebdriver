package pageobject_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class GoogleSearchPage extends AbstractPage{

    private final By locatorSearchResult = By.xpath("//b[contains(text(),'Google Cloud Platform Pricing Calculator')]/ancestor::a");

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCalculatorPage clickSearchResult(){

        WebElement searchResult = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(locatorSearchResult));
        searchResult.click();
        return new GoogleCalculatorPage(driver);
    }
}
