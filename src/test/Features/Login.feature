Feature: LoginTest

@QA
Scenario: Verify Login is successful
Given User launches the application
When User enters credentials
And Clicks on Sign-in button
Then user should be able to login
