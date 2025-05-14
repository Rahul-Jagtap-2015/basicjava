package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AbstractMethodsWebElement
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.google.com");

	WebElement searchBox = driver.findElement(By.name("q"));

	System.out.println("Is displayed: " + searchBox.isDisplayed());
	System.out.println("Is enabled: " + searchBox.isEnabled());

	searchBox.sendKeys("Selenium WebDriver");
	
	System.out.println("Tag name: " + searchBox.getTagName());
	System.out.println("Attribute 'title': " + searchBox.getDomAttribute("title"));

	Thread.sleep(5000);

	searchBox.clear();
	searchBox.sendKeys("WebElement methods");
	searchBox.submit();

	Thread.sleep(5000);
	
	driver.quit();
}
}

