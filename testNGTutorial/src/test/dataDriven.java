package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class dataDriven {
	WebDriver driver=null;
	@Test
	public void logIn() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E://1W//testNGTutorial//src//test//dataDriven.properties");
		prop.load(fis);
		if(prop.getProperty("browser").equals("fireFox"))
		{
			driver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		
	}

}
