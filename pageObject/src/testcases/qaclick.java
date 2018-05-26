package testcases;

import objectRepository.qaclickHomePage;
import objectRepository.qaclickLogInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class qaclick {
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	 driver.get("http://www.qaclickacademy.com/");
	 qaclickHomePage qh=new qaclickHomePage(driver);
	 qh.logIn().click();
	 qaclickLogInPage ql=new qaclickLogInPage(driver);
	 ql.email().sendKeys("hello");
	 ql.password().sendKeys("hello");
	 ql.lgoin().click();
	}

}
