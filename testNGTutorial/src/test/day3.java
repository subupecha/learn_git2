package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Parameters({"URL","APIKey"})
	@Test
	public void webLoginCarLoan(String urlname, String key)
	{
		System.out.println("web log in car");
		System.out.println(urlname);
		System.out.println(key);
	}
	@Test(groups={"smoke"})
	public void mobileLoginCarLoan()
	{
		System.out.println("Mobile log in car");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("i will execute before all the test folder");
	}
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("i will execute before each and every method in day 3 class");
	}
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("i will execute after each and every method in day 3 class");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("i will execute before all the methods in a day3 class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("i will execute after allthe methods in class");
	}
	@Test(enabled=false)
	public void mobileSigninCarLoan()
	{
		System.out.println("Mobile sign in car");
	}
	@Test(timeOut=4000)
	public void mobileLogOutCarLoan()
	{
		System.out.println("Mobile log Out car");
	}
	@Test(dependsOnMethods={"webLoginCarLoan"})
	public void APIloginCarLoan()
	{
		System.out.println("API log in car");
	}
	

}
