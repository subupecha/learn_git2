package test;

import org.testng.annotations.Test;

public class day4 {
	@Test
	public void webLoginHomeLoan()
	{
		System.out.println("web log in Home");
	}
	@Test(groups={"smoke"})
	public void mobileLoginHomeLoan()
	{
		System.out.println("Mobile log in Home");
	}
	@Test
	public void logInAPIHomeLoan()
	{
		System.out.println("API log in Home");
	}
	

}
