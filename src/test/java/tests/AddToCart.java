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

public class AddToCart extends BaseTest {

    @Test
    public static void searchTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://evilgreed.net/collections/music/12%22-VINYL");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]")));

        WebElement shopNowButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/button"));
        shopNowButton.click();

        WebElement clickOnRecord = driver.findElement(By.xpath("//*[@id=\"bc-sf-filter-products\"]/div[4]/div/div/div[1]/a"));
        clickOnRecord.click();

        WebElement clickAddToCartButton = driver.findElement(By.xpath("//*[@id=\"product_form_4733504290876\"]/div[4]/div[2]/button"));
        clickAddToCartButton.click();

        WebElement clickOnShoppingCart = driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/a"));
        clickOnShoppingCart.click();

        WebElement removeItemFromShoppingCart = driver.findElement(By.xpath("//*[@id=\"cart_form\"]/div/div[1]/div/div[2]/div/span[1]"));
        removeItemFromShoppingCart.click();

        driver.quit();



    }
}