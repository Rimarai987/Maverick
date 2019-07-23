Feature: Login Action
Scenario Outline: Succesful login with valid credentials
Given User will open the application
When user will click on sign in link
And user enters "<username>" & "<password>"
Then Message displayed login successful

Examples:
|username|password   |
|lalitha |password123|
|admin   |password456|
