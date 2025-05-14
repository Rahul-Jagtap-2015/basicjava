package SeleniumPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowMaxMinSetSize
{
public static void main(String[] args) throws InterruptedException
{
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://grotechminds.com/");
	
	Thread.sleep(5000);
	
	driver.manage().window().maximize();

	Thread.sleep(5000);
	
	driver.manage().window().minimize();
	
	Thread.sleep(5000);
	
	driver.manage().window().fullscreen();
	
	Thread.sleep(5000);
	
	driver.manage().window().setSize(new Dimension(1000, 800));
	
	Thread.sleep(5000);
	
	driver.close();
	
}
}