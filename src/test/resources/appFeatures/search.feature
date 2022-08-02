
Feature: Amazon Search

@smoke
Scenario: Search a Product MacBook Air
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed
Then Order id is 12345 and username is "sanjiv"

@regression
Scenario: Search a Product Apple Watch
Given I have a search field on Amazon Page
When I search for a product with name "Apple Watch" and price 600
Then Product with name "Apple Watch" should be displayed
Then Order id is 999999 and username is "sanman"

@production
Scenario: Search a Product Apple IPad
Given I have a search field on Amazon Page
When I search for a product with name "Apple IPad" and price 150
Then Product with name "Apple IPad" should be displayed
Then Order id is 565656 and username is "manman"