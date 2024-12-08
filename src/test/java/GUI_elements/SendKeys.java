package GUI_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("basanagouda");
		driver.findElement(By.id("email")).sendKeys("basanagouda1992.krg@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8105999262");
		driver.findElement(By.id("textarea")).sendKeys("At-karaganur");
	}

}
