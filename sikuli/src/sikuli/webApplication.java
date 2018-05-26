package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class webApplication {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		Screen s=new Screen();
		Pattern p1=new Pattern("C://Users//Susmita//Desktop//SikuliImages//googleTexBox.PNG");
		Pattern p2=new Pattern("C://Users//Susmita//Desktop//SikuliImages//googleSearch.PNG");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		s.wait(p1,5000);
		s.click(p1);
		s.type(p1, "selenium");
		s.click(p2);

	}

}
 