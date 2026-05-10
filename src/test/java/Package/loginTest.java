package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.loginpage;

public class loginTest {
	
	     @Test
	
	     
	      public void login() throws InterruptedException {
	    	  
	    	  WebDriverManager.chromedriver().setup();
	    	  WebDriver driver = new ChromeDriver();
	    	  driver.manage().window().maximize();
	    	
	    	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    	  
	    	  loginpage loginPage = new loginpage();
	    	  
	    	  loginPage.emailField().sendKeys("shariaafroz14@gmail.com");
	    	  loginPage.passwordField().sendKeys("shaAFR@13");
	    	  loginPage.loginButton().click();
	    	  
	    	  MyAccountPage myAccountPage = new MyAccountPage();
	    	  Assert.assertTrue(myAccountPage.accountBreadCrumb().isDisplayed());
	    	  Thread.sleep(5000);
	     }
	     
	     
	     @AfterMethod
	     public void clousure() {
	    	 WebDriver driver = null;
			 driver.close();
	     }
	     
}   


