package SeleniumPrograms;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	String parent= driver.getWindowHandle();
	
	System.out.println(parent);
	
	Thread.sleep(5000);
	
	Set<String> child= driver.getWindowHandles();
	
	System.out.println(child);
	
	driver.quit();
}
}
