package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class XPathHoverOverRightClick
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();

	driver.get("https://amazon.in/");

	driver.manage().window().maximize();
	
	WebElement hoverover= driver.findElement(By.xpath("//span[.='Prime']"));
	
    Actions action = new Actions(driver);
    
    action.moveToElement(hoverover).perform();
    
    Thread.sleep(3000);

    action.contextClick().perform(); //right click
       
    action.sendKeys(Keys.ARROW_DOWN);
    action.sendKeys(Keys.ARROW_DOWN);
    action.sendKeys(Keys.ARROW_DOWN);

    action.sendKeys(Keys.ENTER);

	driver.quit();
}
}
