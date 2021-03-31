package amazonPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonTestPage extends homePage {

    homePage home;

    @Test(priority = 1)
    public void testCheckSearchBox() {
        checkSearchBox();
        String expectedText = "\"Gloves\"";
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }


    @Test(priority = 15)
    public void testSignUp() throws InterruptedException {
        driver.findElement(By.cssSelector(".nav-long-width")).click();
        driver.findElement(By.cssSelector("#createAccountSubmit")).click();
        String expectedText = "";
        String actualText = driver.findElement(By.id("ap_customer_name")).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }


}