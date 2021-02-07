package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class E2E_Tests {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisg998\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://labels.sit.hermescloud.co.uk/");

        driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("labels01");
        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("!PasswordSit");
        driver.findElement(By.xpath("//span[text()='Log In']")).click();
        driver.findElement(By.xpath("//span[text()='Create label']")).click();

        driver.findElement(By.xpath("//label[@for='deliveryType']")).click();

        driver.findElement(By.xpath("//label[@for='customerTitle']")).click();
        driver.findElement(By.xpath("//input[@id='customerFirstName']")).sendKeys("Brijesh");
        driver.findElement(By.xpath("//input[@id='customerLastName']")).sendKeys("Virola");

        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("LS166JT");

        driver.findElement(By.xpath("//input[@id='addressLookup']")).click();
        Thread.sleep(4000);

        List<WebElement> options = driver.findElements(By.xpath("//input[@id='addressLookup']"));
        List<String> text = new ArrayList<>();
        for(int i=1; i<options.size(); i++) {
            text.add(options.get(i).getText());
        }
        System.out.println("Options : " + text);

        WebElement AddressLookUp = driver.findElement(By.xpath("//input[@id='addressLookup']"));
        AddressLookUp.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@id='customerPhone']")).sendKeys("07764561387");
        driver.findElement(By.xpath("//input[@id='customerId']")).sendKeys("123456");

        driver.findElement(By.xpath("//span[text()=' Submit ']")).click();
    }
}
