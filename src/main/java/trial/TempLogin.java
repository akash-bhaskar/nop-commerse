package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TempLogin 
{
	public static void main(String[] args)
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open application
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		//click on login 
		driver.findElement(By.xpath("//*[@class='ico-login']")).click();
		
		//enter username
		driver.findElement(By.xpath("//*[@class='email']")).sendKeys("bhaskarakash1104@gmail.com");
		
		//enter password
		driver.findElement(By.xpath("//*[@class='password']")).sendKeys("Akash@007");
		
		//click on sign in
		driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
		
	}
}
