package com.google.selenium.test;

 import java.util.concurrent.TimeUnit;



 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  import Pages.LoginPage;
public class test2 {
	
	ChromeDriver driver;
   

	@BeforeTest
	public void openURL () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

	}

    @Test
    public void testValidLogin() throws InterruptedException {
    	LoginPage login1 = new LoginPage(driver);
    	TimeUnit.SECONDS.sleep(1);
        login1.getUsernameField().sendKeys("standard_user");
        login1.getPasswordField().sendKeys("secret_sauce");
        login1.getLoginButton().click();
    	TimeUnit.SECONDS.sleep(5);
        Assert.assertTrue(login1.getSwagLabsDiv().isDisplayed());
    

     }

	@AfterTest
	public void closeWebsite() {

		driver.quit();
	}
}
