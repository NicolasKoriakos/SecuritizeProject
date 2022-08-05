import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By usernameLocator = By.cssSelector("input[placeholder='username']");
    By passwordLocator = By.cssSelector("input[placeholder='password']");
    By loginButton = By.cssSelector("button[name='login']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password){
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
