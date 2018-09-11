Feature: Creating accounts

Scenario: Creating an account with valid data
Given I am on landing page
And I click on Sign in 
When I press create an account button after populating email address
And fill all the mandatory fields with valid data 
Then successful message should be shown

 