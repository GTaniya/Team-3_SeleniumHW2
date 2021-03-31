import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium {


        static String relativePath = "/resources/drivers/windows/chromedriver.exe";
        static String chromeDriverPath = System.getProperty("user.dir") + relativePath;
        static WebDriver driver;

        @Test

        public void testDoSearch() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();

            driver.get("https://www.amazon.com/");
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();

            WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("sneakers");

            WebElement searchButton =driver.findElement(By.id("nav-search-submit-button"));
            searchButton.click();

            String actualTitle = driver.getTitle().toLowerCase();
            String expectedTitle = "Amazon.com : Sneakers".toLowerCase();

            Assert.assertEquals(actualTitle, expectedTitle, "Title not found");


            Thread.sleep(6000);

            driver.close();
            driver.quit(); // close executable program
        }


    }


