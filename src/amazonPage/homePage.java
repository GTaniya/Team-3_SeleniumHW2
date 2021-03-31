package amazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static amazonPage.amazonWebElement.*;

public class homePage {

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/mac/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }


    // Action Method
    public void checkSearchBox() {
        // Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // click on searchButton
        driver.findElement(By.id(searchButtonLocator)).click();
    }

    // Action Method
    public void checkSignUp() {
        // Enter product name
        driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Pritam");
    }

    public void checkSearch() {
        // Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys("Coffee");
        // click on searchButton
        driver.findElement(By.id(searchButtonLocator)).click();

    }

   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////