import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/giddyup/GiddyUpTests/src/test/resources");
        driver = new ChromeDriver();
    }

    @Test
    public void testExample() {
         driver.get("https://giddyup.io");
         // Add assertions or interactions
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
