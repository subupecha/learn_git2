package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffHomePage {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		public rediffHomePage(WebDriver Driver)
		{
			this.driver=driver;
		}
		By username=By.xpath("//input[@id='login1']");
		By password=By.xpath("//input[@id='password']");
		By go=By.xpath("//input[@value='Go']");
		
		public WebElement username()
		{
			return driver.findElement(username);
		}
		public WebElement password()
		{
			return driver.findElement(password);
		}
		public WebElement go()
		{
			return driver.findElement(go);
		}

	}


