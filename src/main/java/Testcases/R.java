package Testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import Pages.L;
import Pages.Product;
import io.github.bonigarcia.wdm.WebDriverManager;



public class R {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority = 0)
	
	public void sendun() {
		L page = new L(driver);
		page.setUserName("standard_user");
		
	}
	@Test(priority = 1)
	public void sendpw() {
		L page = new L(driver);
		page.setPassword("secret_sauce");
		
	}
	@Test (priority = 2)
	public void clicksub() {
		L page = new L(driver);	
		page.clicklogin();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//public void w() {
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//}

	@Test(priority = 3)
	public void getlandingtitle() {
		Product page= new Product(driver);
		page.findtitle();
		
	}
	@Test(priority = 4)
	public void click1() {
		Product page = new Product(driver);
		page.clickitem1();
	}
	@Test(priority = 5)
	public void click2() {
		Product page = new Product(driver);
		page.clickitem2();
	}
	@Test(priority = 6)
	public void click3() {
		Product page = new Product(driver);
		page.clickitem3();
	}

}
