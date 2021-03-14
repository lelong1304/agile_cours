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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
	@tag1
	Scenario: I create an empty company
		When I command the constructor with no argument
		Then a new object of class Company is created whose all attributes are set to null
		
	@tag2
	Scenario Outline: I want to create a company with specific capital and stock price
		When I provide the value for <capital> and <price> in the constructor respectively
		Then a new object of class Company is created whose <capital> and <stockPrice> is setted by the given parameters
		
		Examples:
			| (capital, price) | capital | stockPrice |
			| (100, 100)       | 100     | 100        |
			
	@tag1
	
	Scenario: Setter description
  Given I have an object Company
  When I call function set Capital with a value
  Then I set the new value into capital
		
		
	@tag1
	Scenario Outline: I want to add some amount to the current capital of an existing company
		Given I have an existing company with <capital>
		When I provide the value for <amount>
		Then the value <amount> is added to the current <capital2> of the company
		
		Examples:
			| capital | amount | capital2 |
			| 100     | 100    | 200      |
					
	@tag1
	Scenario Outline: I want to set the address of an existing company
		Given I have an existing company and an object <address1> of class Address
		When I assign the <address1> 
		Then the company's <address> is setted to the assigned object.
		
		Examples:
			| address1 				| address 			|
			| "75000 Paris"   | "75000 Paris" |  	
		