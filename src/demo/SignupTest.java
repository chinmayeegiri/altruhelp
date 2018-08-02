package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignupTest 
{
	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://altruhelp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/login/auth']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/register/invitation']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chinmayeegiri+1@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'click here ')]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Chinmayee");
		driver.findElement(By.name("lastName")).sendKeys("Giri");
		driver.findElement(By.name("password")).sendKeys("abc@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@id='contact.address.zip']")).sendKeys("08010-0011");
		driver.findElement(By.name("livesOutsideUS")).click();
		driver.findElement(By.name("birthdate")).sendKeys("12/30/1994");
//		driver.findElement(By.xpath("//th[//th[@colspan='5']]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Dec')]")).click();
		driver.findElement(By.xpath("//input[@id='token-input-skillsToken']")).sendKeys("writing");
		driver.findElement(By.xpath("//input[@id='token-input-skillsToken']")).sendKeys("Keys.ENTER");
		driver.findElement(By.xpath("//option[contains(text(),'Advertising')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Caregiver')]")).click();	
		driver.findElement(By.xpath("//option[contains(text(),'Business Development')]")).click();	
		driver.findElement(By.xpath("//option[contains(text(),'Animals')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Arts & Culture')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Animals')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Children & Youth')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Computers & Technology')]")).click();
		
		driver.findElement(By.xpath("//input[@value='false']")).click();
		
		driver.findElement(By.xpath("(//input[@value='true'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.findElement(By.xpath("//input[@id='token-input-employer']")).sendKeys("Someplace");
		driver.findElement(By.name("startDate_month")).click();
		driver.findElement(By.xpath("(//option[contains(text(),'March')])[3]")).click();
		Thread.sleep(2000);;
		driver.findElement(By.name("startDate_year")).click();
		driver.findElement(By.xpath("(//option[@value='2016'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("jobTitle")).sendKeys("Automation Engineer");
		driver.findElement(By.name("division")).sendKeys("QA");
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("linkedIn")).sendKeys("https://www.linkedin.com/in/chinmayee-giri-21624b62/");
		driver.findElement(By.name("agreedToTerms")).click();
		driver.findElement(By.name("submit")).click();
//	driver.close();
}
}
