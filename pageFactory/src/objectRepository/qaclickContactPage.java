package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qaclickContactPage {
	WebDriver driver;
	public qaclickContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="html/body/section/div/div/div[1]/form/div[1]/div[1]/input")
	WebElement Name;
	
	@FindBy(xpath="html/body/section/div/div/div[1]/form/div[1]/div[2]/input")
	WebElement MobileNo;
	
	@FindBy(xpath="html/body/section/div/div/div[1]/form/div[1]/div[3]/input")
	WebElement Country;
	
	@FindBy(xpath="html/body/section/div/div/div[1]/form/div[1]/div[4]/input")
	WebElement Email;
	
    @FindBy(xpath="html/body/section/div/div/div[1]/form/div[1]/div[5]/select")
	  WebElement Subject;
 
    @FindBy(xpath="html/body/section/div/div/div[1]/form/div[1]/div[6]/textarea")
    WebElement Description;
    
    @FindBy(xpath="html/body/section/div/div/div[1]/form/div[2]/div/button")
    WebElement Submit;
    
    public WebElement Name()
    {
    	return Name;
    }
    
    public WebElement MobileNo()
    {
    	return MobileNo;
    }
    
    public WebElement Country()
    {
    	return Country;
    }
    
    public WebElement Email()
    {
    	return Email;
    }
    
    public WebElement Subject()
    {
    	return Subject;
    }
    
    public WebElement Description()
    {
    	return Description;
    }
    
    public WebElement Submit()
    {
    	return Submit;
    }
    
 
 
	  
	

}
