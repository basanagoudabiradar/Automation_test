package dropdown;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
	 WebElement  dropdown= driver.findElement(By.xpath("//select[@id='country']"));
	    Select dp=new Select(dropdown);
	    dp.selectByIndex(1);
	    
	 WebElement  dropdownColors= driver.findElement(By.xpath("//select[@id='colors']"));
	    Select dp1=new Select(dropdownColors);
	    dp1.selectByIndex(1);
	 WebElement  dropdownsortlist= driver.findElement(By.xpath("//select[@id='animals']"));
	    Select dp2=new Select(dropdownsortlist);
	    dp2.selectByIndex(1);
	}

}
