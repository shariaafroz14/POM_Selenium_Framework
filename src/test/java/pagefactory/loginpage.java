package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginpage {
	  
	
	 WebDriver driver;
	 
	 public loginpage(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 }
	 
       @FindBy(id="input-email") 
  private WebElement emailField1;
       
       @FindBy(id="input-password")
       private By passwordField1;
		     
       @FindBy(css="input[value='Login']")
       
       private By loginButton1;
	   public loginpage() {
		// TODO Auto-generated constructor stub
	}

	private By emailField= By.id("input-email");
	private By passwordField=By.id("input-password");
	private By loginButton =By.cssSelector("input[value='Login']");
		  
		  
		    public WebElement emailField() {
		    	
		    	return driver.findElement((By) emailField1);
		    }
		    
		    public WebElement passwordField() {
		    	
		    	return driver.findElement(passwordField1);
		    	
		    }
		    
		    public WebElement loginButton() {
		    	
				return driver.findElement(loginButton1);
		    }
		    	
		    }
		    



