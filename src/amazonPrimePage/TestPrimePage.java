

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TestPrimePage {



        static String relativePath = "/resources/drivers/windows/chromedriver.exe";
        static String chromeDriverPath = System.getProperty("user.dir") + relativePath;
        static WebDriver driver;

        //Test Case 1
//
//        @Test
//
//        public void testPrimeButton() throws InterruptedException {
//            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//            driver = new ChromeDriver();
//
//            driver.get("https://www.amazon.com/");
//            driver.manage().deleteAllCookies();
//            driver.manage().window().maximize();
//
//            WebElement clickPrimeButton = driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[4]/div[2]/div[2]/div[1]/a[3]/span[1]"));
//            clickPrimeButton.click();
//
//            WebElement clickTryPrimeButton =driver.findElement(By.xpath("//a[contains(text(),'Try Prime')]"));
//            clickPrimeButton.click();
//
//            String actualButton = driver.getTitle().toLowerCase();
//            String expectedButton = "Amazon.com: Amazon Prime".toLowerCase();
//
//            Assert.assertEquals(actualButton, expectedButton, "Title not found");
//            Thread.sleep(6000);
//
//            driver.close();
//            driver.quit(); // close executable program
//        }
//
//        //Test Case 2
//
//    @Test
//
//    public void testMenu() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        driver = new ChromeDriver();
//
//        driver.get("https://www.amazon.com/");
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//
//        List<WebElement> primePageMenuLinks = driver.findElements(By.xpath("//div[@id='prime-top-nav']"));
//        String[] actualNavBarTitles = new String[primePageMenuLinks.size()];
//
//        for (int i = 0; i < primePageMenuLinks.size(); i++) {
//            actualNavBarTitles[i] = primePageMenuLinks.get(i).getText();
//        }
//
//        String[] expectedNavBarTitles = {"Prime", "Delivery", "Exclusive Deals", "Prime Insider", "Get Help"};
//
//        SoftAssert softAssert = new SoftAssert();
//
//        for (int i = 0; i < actualNavBarTitles.length; i++) {
//            softAssert.assertEquals(actualNavBarTitles[i], expectedNavBarTitles[i], "TITLE AT THE INDEX OF " + i + " DOES NOT MATCH");
//        }
//
//        softAssert.assertAll();
//
//
//
//    }

    //Test case 3

    @Test

    public void testSeeMemberships() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebElement clickPrimeButton = driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[4]/div[2]/div[2]/div[1]/a[3]/span[1]"));
        clickPrimeButton.click();

//        WebElement clickTryPrimeButton =driver.findElement(By.xpath("//a[contains(text(),'Try Prime')]"));
//        clickPrimeButton.click();


        WebElement clickStudentMembership = driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/a[1]"));
        clickStudentMembership.click();

        WebElement clickTryPrimeStudent = driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/span[1]/span[1]/input[1]"));
        clickStudentMembership.click();

        String actualButton = driver.getTitle().toLowerCase();
        String expectedButton = "Amazon Sign-In".toLowerCase();

        Assert.assertEquals(actualButton, expectedButton, "Title not found");
        Thread.sleep(6000);

        driver.close();
        driver.quit(); // close executable program

    }


    }



