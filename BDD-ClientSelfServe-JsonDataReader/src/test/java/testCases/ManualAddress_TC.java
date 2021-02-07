package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ManualAddress_TC {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Inputting Address Manually");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisg998\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://labels.sit.hermescloud.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("labels01");
        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("!PasswordSit");
        driver.findElement(By.xpath("//span[text()='Log In']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Create label']")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Create label']")).click();

        driver.findElement(By.xpath("//label[@for='deliveryType']")).click();
        driver.findElement(By.xpath("//label[@for='customerTitle__2']")).click();
        driver.findElement(By.xpath("//input[@id='customerFirstName']")).sendKeys("Ashley");
        driver.findElement(By.xpath("//input[@id='customerLastName']")).sendKeys("Green");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm' and @type='button']")).click();
        driver.findElement(By.xpath("//input[@id='line1']")).sendKeys("2 Raynel Approach");
        driver.findElement(By.xpath("//input[@id='line2']")).sendKeys("Cookridge");
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("LS166JT");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Leeds");
        driver.findElement(By.xpath("//input[@id='county']")).sendKeys("West Yorkshire");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("//input[@id='customerPhone']")).sendKeys("07764561387");
        driver.findElement(By.xpath("//input[@id='customerId']")).sendKeys("1234567");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()=' Submit ']")).click();
    }
}
