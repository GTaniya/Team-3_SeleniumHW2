package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static amazon.AmazonWebElements.*;

public class TestClass extends AmazonTodayDeals{

    @Test
    public void testArt(){
        ArtBox();
        String expectedText="Amazon.com : Arteza Real Brush Pens, 48 Colors for Watercolor Painting with Flexible Nylon Brush Tips, Paint Markers for Coloring, Calligraphy, Drawing with Water Brush, Art Supplies for Artists and Beginners : Office Products";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"test failed");
    }

}
