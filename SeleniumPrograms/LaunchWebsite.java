package SeleniumPrograms;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchWebsite
{
public static void main(String[] args) throws InterruptedException
{
	EdgeDriver driver=new EdgeDriver();
	
	driver.get("https://grotechminds.com/");
	
	System.out.println("Website Launched Successfully");
	
	Thread.sleep(5000);
	
	driver.close();
	
	System.out.println("Browser Closed Successfully");
}
}
