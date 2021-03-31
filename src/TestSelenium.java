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

            WebElement searchButton =driver.findElement(By.id("nav-search-submit-button"));
            searchButton.click();

//        String actualTitle = driver.getTitle().toLowerCase();
//        String expectedTitle = "Amazon.com : Sneakers".toLowerCase();
//
//        Assert.assertEquals(actualTitle, expectedTitle, "Title not found");

            WebElement itemLink = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='cart-page-wrap']/div[@id='rhf']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ol[1]/li[2]/div[1]/a[1]/div[2]"));

            String actualItemURL = itemLink.getAttribute("href");
            String expectedItemURL = "https://www.amazon.com/gp/slredirect/picassoRedirect.html/ref=pd_rhf_cart_sspa_dk_rhf_cart_pt_sub_1?ie=UTF8&adId=A0506458W6HET7GCBE49&qualifier=1617153582&id=5876506246569646&widgetName=sp_rhf_cart&url=%2FSantiro-Breathable-Sneakers-Lightweight-Athletic%2Fdp%2FB07XDRZJNH%2Fref%3Dpd_rhf_schuc_s_sspa_dk_rhf_cart_pt_sub_1_2%2F135-1156358-0953063%3F_encoding%3DUTF8%26pd_rd_i%3DB07XDRZJNH%26pd_rd_r%3D73c8f3b6-d024-49f1-892a-ba362fdf91d5%26pd_rd_w%3DQc41d%26pd_rd_wg%3Dmp3FT%26pf_rd_p%3De395063a-7c51-49fa-b79c-f09704530012%26pf_rd_r%3D41SSZC69H38WRVVMYQCK%26psc%3D1%26refRID%3D41SSZC69H38WRVVMYQCK&adOffset=0";

            Assert.assertEquals(actualItemURL, expectedItemURL, "Title not found");

            Thread.sleep(4000);

            driver.close();
            driver.quit(); // close executable program
        }


    }


