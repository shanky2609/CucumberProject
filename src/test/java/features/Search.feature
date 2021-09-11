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
Feature: Search and place order for vegetables
  

  @Selenium
  Scenario: Search for items and validate results
    Given User is on Greencart landing page
    When User search for "Cucumber" Vegetable
    Then "Cucumber" results are displayed
    
  @Selenium
  Scenario: Search for items and then move to checkout page
    Given User is on Greencart landing page
    When User search for "Brinjal" Vegetable
    And  Added items to cart
    And  User proceeded to Checkout page for purchase
    Then Verify selected "Brinjal" item is present in checkout page.
    
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
