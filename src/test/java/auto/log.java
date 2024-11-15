package auto;

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

    public class log {

        private WebDriver driver;
        private Map<String, Object> vars;
        private JavascriptExecutor js;

        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.driver","E:\\cy\\firefoxWebDriver\\geckodriver029-64.exe");
            driver = new FirefoxDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<>();
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void login() {

            driver.get("http://127.0.0.1:8080/auth/");
            driver.manage().window().setSize(new Dimension(1721, 927));

            driver.findElement(By.id("txt_userName")).click();
            driver.findElement(By.id("loginForm")).click();
            driver.findElement(By.id("txt_userPass")).click();
            driver.findElement(By.id("btn_login")).click();

            WebElement element = driver.findElement(By.cssSelector(".layout-panel >.panel-header >.panel-title"));
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(element));

            Assert.assertEquals(element.getText(), "首页");
        }
    }

