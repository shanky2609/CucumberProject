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

Feature: Application Login
  


 @tag1 
    Scenario Outline: Home page default login
    Given User is on Netbanking  landing page
    When User login into apllication with username and password
    Then Home page is populated
    And cards are displayed

  @RegularExpression 
  Scenario Outline: Home page of default login with regular expression
    Given  User is on Netbanking  landing page
    When User login into apllication with "Jin" and password "1234"
      Then Home page is populated
    And cards displayed are "true"
    
  @RegularExpression 
  Scenario Outline: Home page of default login with regular expression
    Given  User is on Netbanking  landing page
    When User login into apllication with "Jack" and password "1253"
      Then Home page is populated
    And cards displayed are "False"

   @DataTable 
  Scenario Outline: Home page of default login with Data table feature
    Given  User is on Netbanking  landing page
    When User sign up with following details
    | jenny | abcd | john@abcd.com | Australia | 3242353 |
      Then Home page is populated
    And cards displayed are "False"
    
     @DataParameterization 
    Scenario Outline: Home page of default login with parameterization
    Given  User is on Netbanking  landing page
    When User login in to application  with <Username> and <Password>
     Then Home page is populated
    And cards displayed are "true"
    
    Examples:
    |Username |Password|
    |User1    |Pass1   |
    |User2    |Pass2   |
    |User3    |Pass3   |
    |User4    |Pass4   |
    |User5    |Pass5   |
    
   
