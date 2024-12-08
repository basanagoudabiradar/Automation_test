package Table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
        int row= driver.findElements(By.xpath("//div[@id='HTML1']//tr")).size();
       System.out.println("num of rows:"+row);
      
       String bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[4]")).getText();
       System.out.println("book name is:"+bookname);
	}

}
