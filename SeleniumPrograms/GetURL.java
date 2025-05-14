package SeleniumPrograms;
import java.net.SocketException;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetURL
{
public static void main(String[] args) throws Exception, SocketException
{
	/*ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	String parent= driver.getWindowHandle();
	
	System.out.println(parent);
	
	Thread.sleep(20000);
	
	Set<String> child= driver.getWindowHandles();
	
	System.out.println(child);
	
	driver.quit();*/
	
	FirefoxDriver driver1=new FirefoxDriver();
	
	driver1.get("https://www.google.com");
	
	String parent1= driver1.getWindowHandle();
	
	System.out.println(parent1);
	
	Thread.sleep(20000);
	
	Set<String> child1= driver1.getWindowHandles();
	
	System.out.println(child1);
	
	driver1.quit();
	

}
}
