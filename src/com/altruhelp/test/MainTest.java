package com.altruhelp.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainTest
{
	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://altruhelp.com/");
		driver.manage().window().maximize();
		SignupPageTest newSignup=new SignupPageTest();
		newSignup.signUp(driver);
		InviteFriendTest newInvite=new InviteFriendTest();
		newInvite.invite(driver);
	//	driver.close();
		
}
}
