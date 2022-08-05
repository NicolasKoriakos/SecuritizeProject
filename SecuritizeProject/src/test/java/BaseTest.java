import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://practis.co.il/automation/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    public void tearDown(){
        driver.quit();
    }
}
