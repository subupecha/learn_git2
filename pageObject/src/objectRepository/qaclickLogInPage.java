package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaclickLogInPage {
	WebDriver driver;
	public qaclickLogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By email=By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/div/input");
	By password=By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/div/input");
	By logIn=By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/input");
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement lgoin()
	{
		return driver.findElement(logIn);
	}

}
