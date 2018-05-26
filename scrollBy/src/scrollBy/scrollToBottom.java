package scrollBy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class scrollToBottom {
	WebDriver driver;
	@Test
	public void scrollToBottom()
	{
		driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		driver.manage().window().maximize();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		
	}
	

}
