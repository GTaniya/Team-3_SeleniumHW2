package NewReleaseTestCase;

import amazonPage.homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NRTestPage extends NRpage {
    NRpage home;

    @Test(priority = 1)
    public void testCheckSearchBox() {
        checkSearchBox();
        String actualText = driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='New Releases']")).getText();

    }

    @Test(priority = 15)
    public void testSignUp() throws InterruptedException {
        String expectedText = "See more New Releases in Video Games";
        driver.findElement(By.cssSelector("#zg_left_colleft div:nth-of-type(1) > .zg_homeListLink > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".prime-cta-signup-button-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#createAccountSubmit")).click();
        Thread.sleep(4000);
    }
}



