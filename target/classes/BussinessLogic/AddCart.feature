Feature: Login and Add to Cart functionality

Background: User launches browser and opens appliccation successfully
Given User launches browser with "chrome" and 
Given User opens application by using

@RegressionTest
Scenario: User successfully login with valid credentials
When user click on login
When user enters valid username as "bhaskarakash1104@gmail.com"
When user enters valid password as "Akash@007"
When user click on sign in
Then application shows Homepage of application