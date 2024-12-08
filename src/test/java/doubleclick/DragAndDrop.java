package doubleclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
        ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement	drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions dd=new Actions(driver);
	dd.dragAndDrop(drag, drop).build().perform();
	}

}
