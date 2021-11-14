package pageobject_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleCalculatorPage extends AbstractPage{

//    @FindBy(xpath = "//*[@id=\"mainForm\"]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]/div[1]/div/div[1]/div/div")
//    private WebElement computeEngineTab;



    private final By locatorComputeEngineTab = By.xpath("//div[@title='Compute Engine']/div/div[@class='hexagon-in2']");

    private final String URL_FRAME = "https://cloudpricingcalculator.appspot.com";

    public GoogleCalculatorPage(WebDriver driver){
        super(driver);
    }

    public GoogleCalculatorPage computeEngineTab(){
        driver.get(URL_FRAME);
        WebElement computeEngineTab = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(locatorComputeEngineTab));
        computeEngineTab.click();
        return this;
    }
}
