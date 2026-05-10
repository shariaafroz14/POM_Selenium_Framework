package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoitDektop {
	
	public static void main(String[]args) {
		
		 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://omayo.blogspot.com/");
         Actions action = new Actions(driver);
         action.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();

}

}
