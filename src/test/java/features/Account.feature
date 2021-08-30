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



Feature: Account
  I want to use this template for my feature file
  
 Background:
Given validate the browser
When browser is triggered
Then Check if browser is started
 
 @tag10 
    Scenario Outline: Home page default login
    Given User is on Netbanking  landing page
    When User login into apllication with username and password
    Then Home page is populated
    And cards are displayed

 