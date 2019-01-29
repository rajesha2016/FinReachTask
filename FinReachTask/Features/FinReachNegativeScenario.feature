Feature: Validate different negative features 

@InvalidScenario
Scenario Outline: Validate application throw error message with invalid credential 
	Given User open the cafetownsend url 
	When User enter invalid username "<username>" 
	And User enter invalid password "<password>" 
	And User click on Login button 
	Then User receive validation error message
	
	Examples: 
		|username|password|
		|InvalidUsername|InvalidPassword|