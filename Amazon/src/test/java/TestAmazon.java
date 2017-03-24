import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 3/24/17.
 */
public class TestAmazon extends Amazon{

    @Test
    public void TestWebsite(){
        driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).click();
    }
    @Test
    public void lets(){

    }
}
