package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumAutoTest extends AutoBaseTest{
    @Test
    public void test_find(){
        String url="http://www.baidu.com";
        String key="selenium";
        driver.get(url);

        WebElement element=driver.findElement(By.name("wd"));

        element.sendKeys(key);
        element.submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.partialLinkText(key)).isDisplayed());
    }
}
