Feature: sample 
#This is how background can be used to eliminate duplicate steps 

Background: 
   User navigates to Google search page 
   Given I am on Google search page 

Scenario: Search for Test
	When I enter a search term "test"
	Then I should go to the "Google Search" page
	And  I should get a link to "Test - Wikipedia"

Scenario: Search for cucumber
	When I enter a search term "cucumber"
	And I click on the Cucumber link
	Then I should go to the "Cucumber" page
	And the URL is "https://cucumber.io/"
	
