package commoDataSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonDataSetUp {
    protected WebDriver driver;
    @BeforeTest
    public void setupDriver() {
        String browser = "chrome"; // You can change this to "firefox" if needed
        if (browser.equals("chrome")) {
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    @AfterTest
    public void teardownDriver() {
        if (driver != null) {
          driver.quit();
        }
    }
}



