import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Q {



    @Test
    public void test1() {

        WebDriver driver = new FirefoxDriver();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        driver.get("https://my.exness.com");

        // -------------- HOME PAGE -------------
//        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside/div/div[2]/div[1]/div[1]/a"))
//                .click();



        // ------------- SIGN IN PAGE -------------


//        wait.until(new Function<WebDriver, Object>() {
//            public WebElement apply(WebDriver driver)
//            {
//                return driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]"));
//            }
//        });



        WebElement codeTextArea = driver.findElement(By.id("login"));
        codeTextArea.sendKeys("marusika6464@mail.ru");

//        WebElement codeTextArea2 = driver.findElement(By.id("password"));
//        codeTextArea2.sendKeys("qwe");
        driver.findElement(By.id("password")).sendKeys("RDZ7KuLX8s6aWUt");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/signin-form/form/exwc-button/button")).click();



        // -------------- MY ACCOUNT PAGE -------------

        wait.until(new Function<WebDriver, Object>() {
            public WebElement apply(WebDriver driver)
            {
                return driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]"));
            }
        });

        WebElement webElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]"));
        webElement.click();

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div/div[2]/div[3]/div/div/div[1]/button")).click();

        WebElement inputArea = driver.findElement(By.id("amount"));
        String value = inputArea.getAttribute("value");
        inputArea.clear();
        String newValue = Integer.toString(Integer.parseInt(value)+1);
        inputArea.sendKeys(newValue);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[3]/div/form/button")).click();

        driver.navigate().refresh();



//        WebElement s = driver.findElement(By.xpath(""));
//        s.click();
//        driver.quit();



//        driver = new EdgeDriver();
//        driver.get("http://seleniumhq.org");
//        Thread.sleep(2000);
//        driver.quit();
//
//        driver = new FirefoxDriver();
//        driver.get("http://seleniumhq.org");
//        Thread.sleep(2000);
//        driver.quit();
    }
}
