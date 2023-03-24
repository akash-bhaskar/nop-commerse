Feature: Login and Add to Cart functionality

Background: User launches browser and opens appliccation successfully
Given User launches browser with "chrome" and 
Given User opens application by using
When user click on login
When user enters valid username as "bhaskarakash1104@gmail.com"
When user enters valid password as "Akash@007"
When user click on sign in

@RegressionTest
Scenario: User successfully able to add item in cart
When user click on computers
When user click on software
When user click to click to add windows pro to cart
When user check items added in cart
Then user confirms item is added to cart