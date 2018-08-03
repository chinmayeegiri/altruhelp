package com.altruhelp.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class InviteFriendTest {
	public void invite(WebDriver driver){
		driver.findElement(By.xpath("//input[@value='Invite A Friend']")).click();
		driver.findElement(By.name("email")).sendKeys("chinmayeegiri+2@gmail.com,chinmayeegiri+3@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Invite')]")).click();
	}
}
