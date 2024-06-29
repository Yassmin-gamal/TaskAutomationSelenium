package Pages;
 

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.saucedemo.com/");
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.className("error-message-container"));
    }

    public WebElement getSwagLabsDiv() {
       return driver.findElement(By.cssSelector(".app_logo"));

      // return driver.findElement(By.xpath("//*[contains(text(),'Swag Labs')]"));
       // return driver.findElement(By.xpath("//*[contains(text(),'Products')]"));

    }
 
}
