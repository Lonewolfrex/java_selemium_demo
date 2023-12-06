Feature: Perform a successful Login and Logout in MRS application 
Scenario: Verification of Login functionailty 
Given Open the chrome and launch the MRS application			
When Enter the Username and Password 
And Select the session
And Click the login Button 			
Then Assert the Successful navigation to home page
When Click on the Logout Button
Then Assert the Successful Navigation to logout page