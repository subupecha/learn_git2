package scrollBy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class scrollBypiexel {
	WebDriver driver;
	
	@Test
	public void scrollByPiexl()
	{
		driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		
	}

}
