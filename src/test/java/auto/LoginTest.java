package auto;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;


public class LoginTest extends AutoBaseTest {

    @Test
    public void login() {
        driver.get("http://127.0.0.1:8080/auth/");

        driver.findElement(By.id("txt_userName")).sendKeys("admin");
        driver.findElement(By.id("txt_userPass")).sendKeys("admin");
        driver.findElement(By.id("txt_userName")).click();
        driver.findElement(By.id("txt_userPass")).click();
        driver.findElement(By.id("btn_login")).click();
        driver.findElement(By.cssSelector(".layout-panel > .panel-header > .panel-title")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".layout-panel > .panel-header > .panel-title")).getText(),"首页");
    }
}




