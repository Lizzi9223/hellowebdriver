import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverSeleniumHQTest {

    @Test
    public void commonSearchTermTestReResultsNotEmpty() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");

        WebElement codeTextArea = driver.findElement(By.id("postform-text"));
        //codeTextArea.sendKeys("Hello from WebDriver");
        codeTextArea.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                                        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                                        "git push origin master --force");

        WebElement nameTextArea = driver.findElement(By.id("postform-name"));
        //nameTextArea.sendKeys("helloweb");
        nameTextArea.sendKeys("how to gain dominance among developers");

//        WebElement comboBoxPasteExpiration = driver.findElement(By.id("select2-postform-expiration-container"));
//        comboBoxPasteExpiration.click();
//        WebElement selectedPasteExpiration = driver.findElement(By.xpath("//*[contains(@id,\"10M\")]"));
//        selectedPasteExpiration.click();
        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//*[contains(@id,\"10M\")]")).click();


//        WebElement comboBoxSyntaxHighlighting = driver.findElement(By.xpath("//*[@id=\"select2-postform-format-container\"]"));
//        comboBoxSyntaxHighlighting.click();
//        WebElement e = driver.findElement(By.xpath("/html/body/span[2]/span/span[1]/input"));
//        e.sendKeys("Bash");

//        driver.findElement(By.id("select2-postform-format-container")).click();
//        driver.findElement(By.xpath("//*[contains(@id,\"sz0x-8\")]")).click();
//        WebElement selectedSyntaxHighlighting = driver.findElement(By.xpath("//*[contains(@id,\"sz0x-8\")]"));
//        selectedSyntaxHighlighting.click();


        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button"));
        saveButton.click();


        WebElement s = driver.findElement(By.xpath(""));
        s.click();
        driver.quit();



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
