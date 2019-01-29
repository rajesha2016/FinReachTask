Feature: Validate different functionalities of Cafe TOWNSEND

@ValidScenario
Scenario Outline: Validate login functionality with valid user name and password 
	Given User open the cafetownsend url
	When User enter username "<username>" 
	And User enter password "<password>"
	And User click on Login button
	Then User navigates to homepage 
	
	Examples: 
		|username|password|
		|Luke|Skywalker|
		
@IncompleteScenario
Scenario: Validate create employee functionality 
	Given User is on homepage
	When User click on Create button
	And User enter Firstname, Last name, Start date, Email 
		|rajesha|moharana|2010-05-03|valid@email.in|
	And User click on Add button
	Then Newly created user added to employee list
