@All
Feature: Uber Booking Feature

@smoke @qa-ready @jira-1101
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from app
When User selects car "sedan" and pickup point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 100 USD

@sanity
Scenario: Booking Cab SUV
Given User wants to select a car type "suv" from app
When User selects car "suv" and pickup point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 150 USD

@smoke @regression
Scenario: Booking Cab Mini
Given User wants to select a car type "mini" from app
When User selects car "mini" and pickup point "Pune" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 200 USD

@regression
Scenario: Booking Cab Hatchback
Given User wants to select a car type "hatchback" from app
When User selects car "sedan" and pickup point "Delhi" and drop location "Jaipur"
Then Driver starts the journey
And Driver ends the journey
Then User pays 500 USD