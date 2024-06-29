package com.google.selenium.test;

import java.util.concurrent.TimeUnit;



 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  import Pages.LoginPage;
public class Test1 {
	
	ChromeDriver driver;
   

	@BeforeTest
	public void openURL () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

	}

	  @Test
    public void testFieldsExist() throws InterruptedException {
	LoginPage login1 = new LoginPage(driver);
	TimeUnit.SECONDS.sleep(1);

        Assert.assertTrue(login1.getUsernameField().isDisplayed());
        Assert.assertTrue(login1.getPasswordField().isDisplayed());
        Assert.assertTrue(login1.getLoginButton().isDisplayed());
    }

	@AfterTest
	public void closeWebsite() {

		driver.quit();
	}
}
