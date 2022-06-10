import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.time.Duration;


public class EvilgreedLogin extends BaseTest {

    @Test
    public static void loginInputField() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://evilgreed.net/account/login?return_url=%2Faccount");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]")));

        WebElement shopNowButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/button"));
        shopNowButton.click();

        WebElement inputEmail = driver.findElement(By.xpath("//*[@id='customer_email']"));
        inputEmail.sendKeys("Evlgrdtest@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath("//*[@id='customer_password']"));
        inputPassword.sendKeys("321512332151233215123");

        WebElement clickLoginButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/form/input[5]"));
        clickLoginButton.click();

        driver.quit();

    //Neradau budo kaip passint reCaptcha
    }
}


