package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumbermap.ConfigReader;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	
	public static ConfigReader config;
	
	public static Hashtable<String, Object> outputParameters=new Hashtable<String, Object>();
	
	public static Hashtable<String, Object> lauchBrowser(Object[]inputParameters) 
	{
		try 
		{					 
		//launch browser
		String key=(String)inputParameters[0];
		if (key.equalsIgnoreCase("chrome")) 
		{
			config=new ConfigReader();
			System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
						
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: lauchBrowser, inputGiven: "+ inputParameters[0]);
		}
		catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method used: lauchBrowser, inputGiven: "+ inputParameters[0]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> openApplication() 
	{
		try 
		{
		//open application
	
		driver.navigate().to(config.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: openApplication, inputGiven: "+ config.getApplicationUrl().toString());
		}
		catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method used: openApplication, inputGiven: "+ config.getApplicationUrl().toString());
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> clickable(Object[]inputParameters) 
	{
		try 
		{	
		//click on login 
		String login=(String)inputParameters[0];
		driver.findElement(By.xpath(login)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: clickable, inputGiven: "+ inputParameters[0]);
		}
		catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method used: clickable, inputGiven: "+ inputParameters[0]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> sendText(Object[]inputParameters) 
	{
		try 
		{	
		//launch browser
		String locator=(String)inputParameters[0];
		String text=(String)inputParameters[1];
		driver.findElement(By.xpath(locator)).sendKeys(text);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method used: sendText, inputGiven: "+ inputParameters[1]);
		}
		catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method used: sendText, inputGiven: "+ inputParameters[1]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> validation(Object[]inputParameters) 
	{
		try 
		{	
		//validation
		String actualText=(String)inputParameters[0];
		String text=(String)inputParameters[1];
	String capturedText=driver.findElement(By.xpath(text)).getText();
	
	if (actualText.equalsIgnoreCase(capturedText)) 
	{
		System.out.println("Test Case Passed");
	}else
	{
		System.out.println("Test Case Failed");
	}
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "Method used: validation, inputGiven :"+ inputParameters[0]);
		}
	catch (Exception e) 
		{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Method used: validation, inputGiven: "+ inputParameters[0]);
		}
		return outputParameters;
	}

		
	public static void main(String[] args) 
	{
		//launch browser
		Object[] input1=new Object [2];
		input1[0]="webdriver.chrome.driver";
		input1[1]="D:\\Automation Support\\Selenium\\chromedriver.exe";
		SeleniumOperations.lauchBrowser(input1);
		
		//open application
		Object[] input2=new Object [1];
		input2[0]="https://demo.nopcommerce.com/";
		SeleniumOperations.openApplication();		
		
		//click on login 
		Object[] input3=new Object [1];
		input3[0]="//*[@class='ico-login']";
		SeleniumOperations.clickable(input3);	
		
		//enter user name
		Object[] input4=new Object [2];
		input4[0]="//*[@class='email']";
		input4[1]="bhaskarakash1104@gmail.com";
		SeleniumOperations.sendText(input4);
		
		//enter password
		Object[] input5=new Object [2];
		input5[0]="//*[@class='password']";
		input5[1]="Akash@007";
		SeleniumOperations.sendText(input5);	
		
		//click on Sign in
		Object[] input6=new Object [1];
		input6[0]="//*[@class='button-1 login-button']";
		SeleniumOperations.clickable(input6);
		
	}
}
