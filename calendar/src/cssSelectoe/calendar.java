package cssSelectoe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendar {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("November"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		 int count=driver.findElements(By.className("day")).size();
		 for(int i=0;i<count;i++)
		 {
			 String text=driver.findElements(By.className("day")).get(i).getText();
			 if(text.equals("23"))
			 {
				 driver.findElements(By.className("day")).get(i).click();
				 break;
			 }
		 }

	}

}
