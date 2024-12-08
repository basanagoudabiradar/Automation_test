package GUI_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
	    WebElement	male=driver.findElement(By.id("male"));
	    male.click();
	    System.out.println("male element is clicked");
	/*    WebElement	female=driver.findElement(By.id("female"));
	    female.click();
	    System.out.println("female element is clicked");
	    */
	    
	    //Weeks selector
	  List<WebElement> Checkbox= driver.findElements(By.xpath("//input[@class='form-check-input']"));
/*	  for(WebElement checkbox:Checkbox)
	  {
		  checkbox.click();
	  }
	*/  
	  for(int i=1;i<Checkbox.size();i++)
	  {
		  Checkbox.get(i).click();
	  }
	}

}
