 
package com.google.selenium.test;

import java.util.concurrent.TimeUnit;



 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  import Pages.LoginPage;
public class Test5 {
	
	ChromeDriver driver;
   

	@BeforeTest
	public void openURL () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

	}

    @Test
    public void testEmptyPassword() throws InterruptedException {
    	LoginPage login1 = new LoginPage(driver);
    	TimeUnit.SECONDS.sleep(1);
        login1.getUsernameField().sendKeys("standard_user");
        login1.getLoginButton().click();
        Assert.assertTrue(login1.getErrorMessage().isDisplayed());
        Assert.assertTrue(login1.getErrorMessage().getText().contains("Epic sadface: Password is required"));
    }

	@AfterTest
	public void closeWebsite() {

		driver.quit();
	}
}
