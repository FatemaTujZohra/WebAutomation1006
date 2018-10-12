
#@YahooSignin
Feature: Yahoo Account Sign in activity test
    As a Yahoo user,
    I want to Sign in and manage Yahoo Account.

Background: Launch the Yahoo web application
   Given I launch the Yahoo home page

Scenario: Checking Yahoo's Sign In activities
   When  I clicked on the Sign in button on the upper-right corner
    And   I provided my yahoo username and password
   Then  I signed into my yahoo account successfully




 