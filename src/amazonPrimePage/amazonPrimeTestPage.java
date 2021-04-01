package amazonPrimePage;


import amazonPage.homePage;
import org.openqa.selenium.By;
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
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[title='Delivery']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".a-text-center.a-button-text > div")).click();
        Thread.sleep(4000);

    }

    @Test(priority = 3)
    public void testLearnMoreButton() throws InterruptedException {

        String expectedText = "Prime Delivery";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[title='Delivery']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[cel_widget_id='acsux-widgets_content-grid_merchandised-search-3_row3-col4'] [alt='Learn more']")).click();
        Thread.sleep(2000);

    }

    @Test(priority = 4)
    public void testGetHelpLink() throws InterruptedException {

        String expectedText = "Amazon.com Help: Help & Customer Service";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[title='Get Help']")).click();
        Thread.sleep(2000);


    }

    @Test(priority = 5)
    public void testManagePrime() throws InterruptedException {

        String expectedText = "Amazon Sign-In";
        driver.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[title='Get Help']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[alt='Manage Prime']")).click();
        Thread.sleep(2000);

    }

    @Test(priority = 6)

    public void testPrimeVideo() throws InterruptedException {
        String expectedText = "Amazon.com: Prime Video: Prime Video";
        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(7) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(6) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".av-retail-m-nav-highlighted > [tabindex='0']")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }


}

