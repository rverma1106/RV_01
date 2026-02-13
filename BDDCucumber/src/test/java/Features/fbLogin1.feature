Feature: Login feature of facebook


Scenario: Successful login

Given user is on login page
When user enters valid username
And user enters valid password
Then user should be able to login