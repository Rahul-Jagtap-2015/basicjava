package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.amazon.in");

	List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	System.out.println("Total links found: " + allLinks.size());

	for (WebElement link : allLinks)
	{
	            String href = link.getDomAttribute("href");
	            String text = link.getText().trim();
	            
	 if (href != null && !href.isEmpty())
	 {
		 System.out.println("Link: " + href);
		 System.out.println("Text: " + (text.isEmpty() ? "[No Text]" : text));
		 System.out.println("---------------");
	 }
	}
	
	driver.quit();
}
}
