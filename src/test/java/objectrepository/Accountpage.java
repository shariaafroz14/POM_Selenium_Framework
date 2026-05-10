package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountpage {
	
	
	      WebDriver driver;
	      
	      public Accountpage(WebDriver driver) {
	    	  
	    	  this .driver=driver;
	    	  
	      }
	      
	      private By accountBreadCrumb= By.xpath("//*[@class='breadcrumb']//a[text()='Account']");
	      
	      public WebElement accountBreadCrumb() {
	    	  
	    	  return driver.findElement(accountBreadCrumb);
	      }
	      }
