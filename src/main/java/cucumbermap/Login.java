package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	@Given ("^User launches browser with \"(.*)\" and$")
	public static void bLaunch(String key)
	{
		//launch browser
				Object[] input1=new Object [1];
				input1[0]=key;
				Hashtable<String, Object> output1= SeleniumOperations.lauchBrowser(input1);	
				HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "^User launches browser with \\\"(.*)\\\" and$", output1.get("MESSAGE").toString());			
	}
	@Given ("^User opens application by using$")
	public void user_opens_application_by_using() 
	{
		//open application				
				Hashtable<String, Object> output2= SeleniumOperations.openApplication();
				HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "User opens application by using {string}", output2.get("MESSAGE").toString());
	}

	@When("user click on login")
	public void user_click_on_login() 
	{
		//click on login 
				Object[] input3=new Object [1];
				input3[0]="//*[@class='ico-login']";
				Hashtable<String, Object> output3= SeleniumOperations.clickable(input3);
				HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user click on login", output3.get("MESSAGE").toString());
	}

	@When("user enters valid username as {string}")
	public void user_enters_valid_username_as(String string) 
	{
		//enter user name
				Object[] input4=new Object [2];
				input4[0]="//*[@class='email']";
				input4[1]=string;
				Hashtable<String, Object> output4= SeleniumOperations.sendText(input4);
				HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enters valid username as {string}", output4.get("MESSAGE").toString());
	}

	@When("user enters valid password as {string}")
	public void user_enters_valid_password_as(String string) 
	{
		//enter password
				Object[] input5=new Object [2];
				input5[0]="//*[@class='password']";
				input5[1]=string;
				Hashtable<String, Object> output5= SeleniumOperations.sendText(input5);
				HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enters valid password as {string}", output5.get("MESSAGE").toString());
	}

	@When("user click on sign in")
	public void user_click_on_sign_in() 
	{
		//click on Sign in
				Object[] input6=new Object [1];
				input6[0]="//*[@class='button-1 login-button']";
				Hashtable<String, Object> output6= SeleniumOperations.clickable(input6);
				HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user click on sign in", output6.get("MESSAGE").toString());
	}

	@Then("application shows Homepage of application")
	public void application_shows_homepage_of_application() 
	{
		//validation
				Object[] input7=new Object [2];
				input7[0]="Welcome to our store";
				input7[1]="//*[text()='Welcome to our store']";
				Hashtable<String, Object> output7= SeleniumOperations.validation(input7);
				HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "application shows Homepage of application", output7.get("MESSAGE").toString());
	}
}
