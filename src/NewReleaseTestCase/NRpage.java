package NewReleaseTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static amazonPage.amazonWebElement.*;

//import static NewReleaseTestCase.NRpage.NRWebElement.*;


public class NRpage {
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   //WebDriver driver;
    WebDriver driver = new FirefoxDriver();

    @BeforeMethod
    public void setUp() {
        String geckoDriverPath = "BrowserDriver/mac/geckodriver.exe";
        System.setProperty("webdriver.firefox.driver", geckoDriverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
