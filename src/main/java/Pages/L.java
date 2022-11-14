package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class L {
	
	
	WebDriver driver;
	
	public L(WebDriver driver) {
		this.driver= driver;
	}
	
    By UserName = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
   By loginbutton = By.name("login-button");
   //By title = By.className("Product");
   
   public void setUserName (String strusername) {
		driver.findElement(UserName).sendKeys(strusername);
	}
	public void setPassword (String strpass) {
		driver.findElement(password).sendKeys(strpass);
	}
	public void clicklogin() {
		driver.findElement(loginbutton).click();
	}

}
