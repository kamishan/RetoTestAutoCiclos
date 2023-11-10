package definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    static WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/AMBIENTES/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void close(){driver.quit();
    }

    static public WebDriver getDriver(){
        return driver;
    }
}
