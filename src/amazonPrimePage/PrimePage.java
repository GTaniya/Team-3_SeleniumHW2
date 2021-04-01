package amazonPrimePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static amazonPage.amazonWebElement.*;

public class PrimePage {

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }


    // Action Method
//    public void checkPrimeButton() {
//        // Enter product name
//        driver.findElement(By.xpath("//span[normalize-space()='Prime']"));
//    }

    public void checkTryPrimeButton() {

        driver.findElement(By.xpath("//input[@id='signInSubmit']"));

    }

    public void checkPrimeVideo() {

        driver.findElement(By.xpath("//input[@id='signInSubmit']"));

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
