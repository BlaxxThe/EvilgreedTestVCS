package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchTest extends BaseTest{

    @Test
    public static void searchTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://evilgreed.net/search?type=product&q=");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]")));

        WebElement shopNowButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/button"));
        shopNowButton.click();

        WebElement searchBoxText = driver.findElement(By.xpath("//*[@id='bc-sf-search-box-3']"));
        searchBoxText.sendKeys("a place to bury strangers");

        WebElement clickSearchButton = driver.findElement(By.xpath("/html/body/div[5]/form/button"));
        clickSearchButton.click();

        WebElement clickItem = driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-products\"]/div/div/div/div[1]/a"));
        clickItem.click();

        driver.quit();

    }
}
