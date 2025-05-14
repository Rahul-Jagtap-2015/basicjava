package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.name("q"));
	
	search.clear(); //ignore this line
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println("Total links on the page = " + links.size());
	
	Thread.sleep(3000);
	
	driver.close();
	
}
}
