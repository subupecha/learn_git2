package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaclickHomePage {
	WebDriver driver;
	public qaclickHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By logIn=By.xpath("html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	public WebElement logIn()
	{
		return driver.findElement(logIn);
	}

}
