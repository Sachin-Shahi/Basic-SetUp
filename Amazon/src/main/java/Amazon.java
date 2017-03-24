import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by DAGR8DON on 3/24/17.
 */
public class Amazon {
    public WebDriver driver = null;
    @BeforeMethod
public void setup(){
       System.setProperty("webdriver.chrome.driver", "../Amazon/driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
