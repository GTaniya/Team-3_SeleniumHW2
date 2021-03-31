package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;

import static amazon.AmazonWebElements.*;

public class AmazonTodayDeals {


    //Will Load A New Web Page In The Current Browser Window
    WebDriver driver;

    //Robot Available for All Below Methods
    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
            System.out.println("\n*** Robot Unable To Perform Action ***");
        }
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Performs Action Before Methods is Operated
    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    // Art box
    public void ArtBox() {
        driver.findElement(By.xpath(TodayDealslink)).click();
        driver.findElement(By.xpath(ArtsCheckBox)).click();
        driver.findElement(By.xpath(ArtBoxLink)).click();




    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Performs Action After Methods has Operated
    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}




