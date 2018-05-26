package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	        
		
	        @Test
	    	public void enterUrl()
	    	{
	    		System.out.println("www.google.com");
	    	}
	    	@Test(dataProvider="getData")
	    	public void logIn(String userName,String password)
	    	{
	    		System.out.println("successfully loggedin");
	    		System.out.println(userName);
	    		System.out.println(password);
	    	}
	    	@DataProvider
	    	public Object[][] getData()
	    	{
	    		Object[][] data=new Object[3][2];
	    		data[0][0]="firstUserName";
	    		data[0][1]="firstPassword";
	    		data[1][0]="secondUserName";
	    		data[1][1]="secondPassword";
	    		data[2][0]="thirdUsername";
	    		data[2][1]="thirdPassword";
	    		
	    		return data;
	    	}

		
		
	}


