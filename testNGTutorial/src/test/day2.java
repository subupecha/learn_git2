package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups={"smoke"})
	
	public void ploan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequiest()
	{
		System.out.println("i will execute first before all the test inside a test folder");
	}
	@AfterTest
	public void lastExecution()
	{
		System.out.println("i will execute last after all the test cases inside a test folder");
	}
	

}
