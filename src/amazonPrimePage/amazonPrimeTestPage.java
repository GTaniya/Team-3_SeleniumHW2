package amazonPrimePage;


import amazonPage.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonPrimeTestPage extends PrimePage {

    homePage home;

    //Test 1

    @Test(priority = 1)
    public void testPrimeButton() throws InterruptedException {

        String expectedText = "Amazon.com: Amazon Prime";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".prime-cta-signup-button-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#createAccountSubmit")).click();
        Thread.sleep(4000);

    }

    //Test 2

    @Test(priority = 2)
    public void testDeliveryLink() throws InterruptedException {

        String expectedText = "Prime Delivery";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[title='Delivery']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[alt='Learn More about Same-Day Delivery']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);

    }

    @Test(priority = 3)
    public void testLearnMoreButton() throws InterruptedException {

        String expectedText = "Prime Delivery";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[title='Delivery']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[cel_widget_id='acsux-widgets_content-grid_merchandised-search-3_row3-col4'] [alt='Learn more']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);

    }

    @Test(priority = 4)
    public void testGetHelpLink() throws InterruptedException {

        String expectedText = "Amazon.com Help: Help & Customer Service";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[title='Get Help']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//div[@class='a-section a-spacing-large ss-landing-container-wide']//h3[contains(.,'Your Orders')]")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);

    }

    @Test(priority = 5)
    public void testManagePrime() throws InterruptedException {

        String expectedText = "Amazon Sign-In";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[title='Get Help']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[alt='Manage Prime']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);

    }
    @Test(priority = 6)
    public void testPrimeInsider() throws InterruptedException {

        String expectedText = "Amazon Sign-In";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[title='Prime Insider']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector(".prime-insider-nav-bar-about-column > a")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//a[.='FREE Two-Day Delivery']")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, 40);

}
    @Test(priority = 7)
    public void testHomeandKitchen() throws InterruptedException {

        String expectedText = "Amazon.com: Just for Prime";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.cssSelector("[title='Exclusive Deals']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);

    }



    @Test(priority = 8)
    public void testPrimeVideo() throws InterruptedException {
        String expectedText = "Amazon.com: Prime Video: Prime Video";
        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(7) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(6) > a")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }


}

