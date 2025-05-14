package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLogin
{
public static void main(String[] args) throws InterruptedException
{
FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement signin=driver.findElement(By.id("nav-link-accountList"));
	
	signin.click();
	
	WebElement email=driver.findElement(By.id("ap_email_login"));
	
	if (email.isDisplayed() && email.isEnabled());
	{
	email.sendKeys("rahulj2005@gmail.com");
	}	
	
	WebElement submitbutton=driver.findElement(By.className("a-button-input"));
	
	submitbutton.click();
	
	WebElement password=driver.findElement(By.name("password"));
	
	password.sendKeys("**********");
	
	WebElement signinbutton=driver.findElement(By.id("signInSubmit"));
	
	signinbutton.click();
	
	Thread.sleep(5000);
	
	System.out.println("Amazon Login Attempt Complete");
	
	driver.close();
}
}
