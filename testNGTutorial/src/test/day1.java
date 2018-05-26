package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void demo()
	{
		System.out.println("true");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("i m the no in suite level,execute first before all the test folder");
	}
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}

}
