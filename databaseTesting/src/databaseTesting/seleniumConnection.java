package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "root", "warmhole");
          Statement s=con.createStatement();
         ResultSet rs= s.executeQuery("select * from credential where username='abcgfd';");
         while(rs.next())
         {
        	 WebDriver driver=new FirefoxDriver();
        	 driver.get("https://login.salesforce.com/");
        	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("username"));
        	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("password"));
        	 
         }
          

	}

}
