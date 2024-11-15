package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;

public class AutoBaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver","E:\\cy\\firefoxWebDriver\\geckodriver029-64.exe");

        driver=new FirefoxDriver();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
