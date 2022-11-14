package Pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class Product {

	
WebDriver driver;

public Product(WebDriver driver) {
	this.driver=driver;
}

By ProdTitle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");
//By Item1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
By Item1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
By Item2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]");
By Item3 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/button[1]");
By ProdTitle1 = By.name("Product");




public void findtitle(){
	 driver.findElement(ProdTitle).getText();
	
}
public void clickitem1() {
	driver.findElement(Item1).click();
}
public void clickitem2() {
	driver.findElement(Item2).click();
	
}
public void clickitem3() {
	driver.findElement(Item3).click();
	
}
}
	
	
	

