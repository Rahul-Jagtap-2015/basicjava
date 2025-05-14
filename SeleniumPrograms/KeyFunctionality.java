package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyFunctionality
{
public static void main(String[] args) throws InterruptedException
{
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	
	search.click();
	
	search.sendKeys("headphones");
	
	search.sendKeys(Keys.ENTER);
	
	Thread.sleep(5000);
	
	driver.close();
}
}
