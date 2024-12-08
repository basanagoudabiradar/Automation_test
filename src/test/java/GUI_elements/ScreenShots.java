package GUI_elements;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	   //TakesScreenshot st= (TakesScreenshot) driver;
/*	   File	sourcefile=st.getScreenshotAs(OutputType.FILE);
	   File targetfile= new File(System.getProperty("user.dir")+"\\ScreenShots\\homepage.png");
	   sourcefile.renameTo(targetfile);
	*/   
	   //Screen short of title
		WebElement title=driver.findElement(By.xpath("//h1[@class='title']"));
		File stitle=title.getScreenshotAs(OutputType.FILE);
	   File dtitle=new File(System.getProperty("use.dir")+"\\ScreenShots\\title.png");
	   stitle.renameTo(dtitle);
	}

}
