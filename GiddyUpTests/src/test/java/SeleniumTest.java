import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
    private final WebDriver driver= new ChromeDriver();
    @Test
    public void testExample() {
         driver.get("https://giddyup.io");
         boolean isDisplayed = driver.findElement(By.cssSelector("a[class='rm-anchor'] img[class='img-fluid']")).isDisplayed();
         assert isDisplayed : "Element is not Displayed";
    }
    @AfterMethod
    public void tearDown() {
            driver.quit();
    }
}
