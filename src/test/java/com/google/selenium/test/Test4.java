 
package com.google.selenium.test;

import java.util.concurrent.TimeUnit;



 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  import Pages.LoginPage;
public class Test4 {
	
	ChromeDriver driver;
   

	@BeforeTest
	public void openURL () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

	}

    @Test
    public void testEmptyUsername() throws InterruptedException {
    	LoginPage login1 = new LoginPage(driver);
    	TimeUnit.SECONDS.sleep(1);
        login1.getPasswordField().sendKeys("secret_sauce");
        login1.getLoginButton().click();
        Assert.assertTrue(login1.getErrorMessage().isDisplayed());
        Assert.assertTrue(login1.getErrorMessage().getText().contains("Epic sadface: Username is required"));
    }

	@AfterTest
	public void closeWebsite() {

		driver.quit();
	}
}
