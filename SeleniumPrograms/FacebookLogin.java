package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin
{
public static void main(String[] args) throws InterruptedException
{
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement email=driver.findElement(By.name("email"));
	
	email.sendKeys("rahulj2005@rediffmail.com");
	
	WebElement password=driver.findElement(By.name("pass"));
	
	password.sendKeys("**********");
	
	WebElement loginbutton=driver.findElement(By.name("login"));
	
	loginbutton.click();
	
	Thread.sleep(5000);
	
	System.out.println("Facebook Login Attempt Complete");
	
	
	
}
}
