package scrollBy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class scrollByVisibleElement {
	WebDriver driver;
	@Test
	public void scrollByVisibleText()
	{
		driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		driver.manage().window().maximize();
		WebElement Element=driver.findElement(By.linkText("Linux"));
		js.executeScript("argument[0].scrollIntoView();", Element);
		
	}

}
