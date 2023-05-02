#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login @regression
Feature: Crater app user management
Users with permissions should be able to interact
with the application on successful login

	@validLogin @loginTests @smokeTest
	Scenario: Successful login  (1 scenario, 1 test)
		Given As a user, I am on the login page (precondition)
		When i enter a valid username and valid password (Actions)
		And i click on login button (Actions)
		Then i should be on user profile page (validation)
	
	
	@invalidLogin @loginTests
	Scenario: Invalid username login
		Given As a user, I am on the login page
		When i enter a invalid username and valid password
		And i click on login button
		Then i should see an error message
		And i should not be logged in
    
