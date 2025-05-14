package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
	
	dropdown.click();
	
	Select select=new Select(dropdown);
	
	select.selectByVisibleText("Car & Motorbike");
	
	Thread.sleep(2000);
	
	WebElement search=driver.findElement(By.id("nav-search-submit-button"));
	
	search.click();
	
	
	

	
	
	
	
}
}
