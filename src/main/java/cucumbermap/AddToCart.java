package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class AddToCart 
{
	@When("user click on computers")
	public void user_click_on_computers() 
	{
		//click on computers
				Object[] input7=new Object [1];
				input7[0]="(//*[text()='Computers '])[1]";
				Hashtable<String, Object> output7= SeleniumOperations.clickable(input7);
				HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user click on computers", output7.get("MESSAGE").toString());
	}

	@When("user click on software")
	public void user_click_on_software() 
	{
		//click on software
				Object[] input8=new Object [1];
				input8[0]="(//*[text()='Software '])[3]";
				Hashtable<String, Object> output8= SeleniumOperations.clickable(input8);
				HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user click on software", output8.get("MESSAGE").toString());
	}

	@When("user click to click to add windows pro to cart")
	public void user_click_to_click_to_add_windows_pro_to_cart() 
	{
		//click to add windows 8 pro to cart
				Object[] input9=new Object [1];
				input9[0]="(//*[text()='Add to cart'])[2]";
				Hashtable<String, Object> output9= SeleniumOperations.clickable(input9);
				HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "user click to click to add windows pro to cart", output9.get("MESSAGE").toString());
	}

	@When("user check items added in cart")
	public void user_check_items_added_in_cart() 
	{
		Object[] input10=new Object [1];
		input10[0]="//*[@class='ico-cart']";
		Hashtable<String, Object> output10= SeleniumOperations.clickable(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "user check items added in cart", output10.get("MESSAGE").toString());
	}

	@Then("user confirms item is added to cart")
	public void user_confirms_item_is_added_to_cart() 
	{
		Object[] input11=new Object [2];
		input11[0]="Gift wrapping";
		input11[1]="//*[@class='text-prompt']";
		Hashtable<String, Object> output11= SeleniumOperations.validation(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "application shows Homepage of application", output11.get("MESSAGE").toString()); 
	}	
}
