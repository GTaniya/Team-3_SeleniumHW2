package azazonTodayDealsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static azazonTodayDealsPage.amazonDealsWebElement.amazonUrl;

public class DealsPage {


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


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        @AfterMethod
        public void tearDown() {
            driver.close();
            driver.quit();
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


