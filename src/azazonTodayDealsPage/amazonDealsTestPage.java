package azazonTodayDealsPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class amazonDealsTestPage extends DealsPage {
    DealsPage home;

    @Test
    public void testTodayDeals() throws InterruptedException {
        String expectedText = "International Shopping: Shop special offers and deals that ship internationally";
        driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_0']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-action='a-dropdown-button']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void testSortByFeatures() throws InterruptedException {
        String expectedText = "International Shopping: Shop special offers and deals that ship internationally";
        driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_0']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-action='a-dropdown-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-value='{\\\"stringVal\\\":\\\"BY_PRICE_ASCENDING\\\"}']")).click();
        Thread.sleep(2000);

    }
}
