package amazonTodayDealsPage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class amazonDealsTestPage extends DealsPage {
    DealsPage home;

    @Test(priority = 3, enabled = false)
    public void testTodayDeals() {
        String expectedText = "International Shopping: Shop special offers and deals that ship internationally";
        driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_0']")).click();
        driver.findElement(By.cssSelector("[data-action='a-dropdown-button']")).click();

    }

    @Test(priority = 4, enabled = false)
    public void testSortByFeatures() {
        String expectedText = "International Shopping: Shop special offers and deals that ship internationally";
        driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_0']")).click();
        driver.findElement(By.cssSelector("[data-action='a-dropdown-button']")).click();
        driver.findElement(By.cssSelector("[data-value='{\\\"stringVal\\\":\\\"BY_PRICE_ASCENDING\\\"}']")).click();


    }

    @Test(priority = 2, enabled = false)
    public void testDealType() {
        String expectedText = "International Shopping: Shop special offers and deals that ship internationally";
        driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_0']")).click();
        driver.findElement(By.cssSelector("[data-action='a-dropdown-button']")).click();
        driver.findElement(By.cssSelector("#widgetFilters > div:nth-of-type(2) > .a-row > .a-text-bold")).click();

    }

    @Test(priority = 1, enabled = false)
    public void testDealsAndPromotins() {
        String expectedText = "International Shopping: Shop special offers and deals that ship internationally";
        driver.findElement(By.xpath("//a[.=\"Today's Deals\"]")).click();
    }

    @Test
    public void testDealOfTheDay() {
        String expectedText = "International Shopping: Shop special offers and deals that ship internationally";
        driver.findElement(By.xpath("//a[.=\"Today's Deals\"]")).click();
        driver.findElement(By.xpath("//a[.='Deal of the Day']")).click();


    }

    @Test
    public void testLightningDeals() {
        String expectedText = "Amazon.com: Bedsure Duvet Cover Twin Set Zipper Closure (68x90 Inch) Navy Ultra Soft Brushed Microfiber Comforter Cover with Corner Ties (1 Duvet Cover and 1 Pillow Sham) Easy Care: Kitchen & Dining";
        driver.findElement(By.xpath("//a[.=\"Today's Deals\"]")).click();
        driver.findElement(By.xpath("//a[.='Lightning Deals']")).click();
        driver.findElement(By.xpath("//div[@id='widgetContent']/div[contains(.,'$14.44 - $19.54')]")).click();




    }
}





