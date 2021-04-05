package NewReleaseTestCase;

import amazonPage.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NRTestPage extends NRpage {
    homePage home;

    @Test(priority = 1)
    public void NewReleaseButton() throws InterruptedException {

        String actualTest = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='New Releases']"));
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//a[.='See more New Releases in Video Games']"));
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
    }

    @Test(priority = 2)
    public void testAppsGames() throws InterruptedException {
        String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Books & Comics";
        driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='New Releases']"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Apps & Games']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Books & Comics']")).click();
        Thread.sleep(4000);
    }

    @Test(priority = 3)
    public void testCarElectronic() throws InterruptedException {
        String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Car Electronics";
        driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='New Releases']"));
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//a[@href='https://www.amazon.com/gp/new-releases/electronics/ref=zg_bsnr_nav_0']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//a[.='Car Electronics']")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, 40);
    }

    @Test(priority = 4)
    public void testMHRShoppingCart() throws InterruptedException {
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='New Releases']"));
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//div[.='Monster Hunter Rise - Nintendo Switch']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);
    }

    @Test(priority = 5)
    public void testCDVinyl() throws InterruptedException {
        String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Metal";
        driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='New Releases']"));
        WebDriverWait wait = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//a[.='CDs & Vinyl']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        driver.findElement(By.xpath("//a[.='Hard Rock & Metal']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 40);
    }



}



