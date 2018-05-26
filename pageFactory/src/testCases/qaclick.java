package testCases;

import objectRepository.qaclickAboutPage;
import objectRepository.qaclickContactPage;
import objectRepository.qaclickHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class qaclick {
	@Test
	public void qaclick()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/");
		qaclickHomePage qh=new qaclickHomePage (driver);
		qh.About().click();
		qaclickAboutPage qa=new qaclickAboutPage(driver);
		qa.contact().click();
		qaclickContactPage qc=new qaclickContactPage(driver);
		qc.Name().sendKeys("susmita");
		qc.MobileNo().sendKeys("9110234529");
		qc.Country().sendKeys("india");
		qc.Email().sendKeys("prustisusmita18@gmail.com");
		Select s=new Select(qc.Subject());
		s.selectByVisibleText("Online Courses");
		qc.Description().sendKeys("i want to learn selenium online courses");
		qc.Submit().click();
		
		
	}

}
