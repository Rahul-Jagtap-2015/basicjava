package SeleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers
{
public static void main(String[] args) throws Exception
{
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://grotechminds.com/");
	
	System.out.println("Chrome Browser Launched Successfully");
	
	Thread.sleep(5000);
	
	driver.quit();
	
	System.out.println("Chrome Browser Closed Successfully");
	
	EdgeDriver driver1=new EdgeDriver();
	
	driver1.get("https://grotechminds.com/");
	
	System.out.println("Edge Browser Launched Successfully");
	
	Thread.sleep(5000);
	
	driver1.quit();
	
	System.out.println("Edge Browser Closed Successfully");
	
	FirefoxDriver driver2=new FirefoxDriver();
	
	driver2.get("https://grotechminds.com/");
	
	System.out.println("Firefox Browser Launched Successfully");
	
	Thread.sleep(5000);
	
	driver2.quit();
	
	System.out.println("Firefox Browser Closed Successfully");
}
}
