package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qaclickHomePage {
	WebDriver driver;
	public qaclickHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="html/body/header/div[2]/div/nav/ul/li[7]/a")
	WebElement About;
	 public WebElement About()
	 {
		 return About;
	 }
	
	

}
