package pageObjects;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class HomePage {

    WebDriver driver;


    public HomePage(WebDriver driver) throws FileNotFoundException {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void navigateTo_HomePage() throws FileNotFoundException {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationURL());
    }
}
