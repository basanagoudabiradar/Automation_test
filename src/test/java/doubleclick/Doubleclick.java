package doubleclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Doubleclick {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement	field1=driver.findElement(By.xpath("//input[@id='field1']"));
	WebElement	field2=driver.findElement(By.xpath("//input[@id='field2']"));
	WebElement box=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	field1.clear();
    field1.sendKeys("hi");
    Actions dk=new Actions(driver);
    dk.doubleClick(box).perform();
     
	}

}
