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

public class ContactTest extends BaseTest {

    @Test
    public static void searchTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://evilgreed.net");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]")));

        WebElement shopNowButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/button"));
        shopNowButton.click();

        WebElement clickContactButton = driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[2]/div/div/ul/li[8]/p/a"));
        clickContactButton.click();

        WebElement inputName = driver.findElement(By.xpath("//*[@id=\"contactFormName\"]"));
        inputName.sendKeys("Ed");

        WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"contactFormEmail\"]"));
        inputEmail.sendKeys("Evlgrdtest@gmail.com");

        WebElement typeMessage = driver.findElement(By.xpath("//*[@id=\"contactFormMessage\"]"));
        typeMessage.sendKeys("666");

        WebElement clickSendButton = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/p[2]/input"));
        clickSendButton.click();

        driver.quit();




    }
}