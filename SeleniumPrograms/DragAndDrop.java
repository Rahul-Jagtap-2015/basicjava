package SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://grotechminds.com/drag-and-drop/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	//WebElement json=driver.findElement(By.id("container-10"));
	
	WebElement cucumber=driver.findElement(By.id("container"));
	
	//WebElement postman=driver.findElement(By.id("container-6"));
	
	WebElement drop=driver.findElement(By.id("div2"));
	
	Actions action=new Actions(driver);
	
	action.dragAndDrop(cucumber, drop).perform();
	
	Thread.sleep(10000);
	
	action.dragAndDrop(drop,cucumber).perform();
	
	driver.close();
		
}
}
