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

public class CategoriesNew extends BaseTest {
    @Test
    public static void searchTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://evilgreed.net/collections/new-music");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]")));

        WebElement shopNowButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/button"));
        shopNowButton.click();

        WebElement categoryCheckbox = driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-options-wrapper\"]/div[1]/div[2]/ul/li/a/span[2]"));
        categoryCheckbox.click();

        WebElement productTypeTwelveInchVinyl = driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-options-wrapper\"]/div[3]/div[2]/div/div[1]/ul/li[3]/a/span[2]"));
        productTypeTwelveInchVinyl.click();

        WebElement chooseProduct = driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-products\"]/div[3]/div/div/div[1]/a"));
        chooseProduct.click();

        driver.quit();
    }
}
