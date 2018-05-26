package testcases;

import objectRepository.rediffHomePage;
import objectRepository.rediffSignInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class logInApplication {
	
	@Test
	public void logIn()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com/");;
		rediffSignInPage rd=new rediffSignInPage(driver);
		rd.signIn().click();
		rediffHomePage rh=new rediffHomePage(driver);
		rh.username().sendKeys("hello");
		rh.password().sendKeys("hello");
		rh.go().click();
		
	}

}
