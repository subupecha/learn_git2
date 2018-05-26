package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffSignInPage {



	
		WebDriver driver;
		public  rediffSignInPage(WebDriver driver) {
			this.driver=driver;
		}
		
		
		By signin=By.xpath("//div[@id='homewrapper']/div[3]/span[4]/span[1]/a[1]");
		
		// TODO Auto-generated method stub
		public WebElement signIn()
		{
			return driver.findElement(signin);
		}

	}


