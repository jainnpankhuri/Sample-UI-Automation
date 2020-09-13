@SmokeTest 
Feature: Flight ticket booking functionality 


Scenario Outline: 
	Open Blazedemo Website and enter valid details to get the flight details 
	Given I navigate to the Blazedemo "<website>" 
	And I enter departure city "<departureCity>" 
	And I enter destination city "<destinationCity>" 
	When I click on Find Flights 
	Then I navigate to Flight details Page 
	When I choose the flight 
	Then I navigate to the next page to enter passanger details 
	And I enter below the required details 
		|Name|Address|City|State|ZipCode|CardType|CreditCardNumber|CardMonth|CardYear|NameOnCard|
		|John Smith|5th Cross Bengaluru|Bengaluru|Karnataka|560017|Visa|400890047878|09|2028|John Smith|
	And I click on Purchase Flight 
	Then I navigate to confirmation page 
	And I veriy the confirmationId 
	
	
	Examples: 
		|website|departureCity|destinationCity|
		|http://blazedemo.com|Boston|New York|
		
#As this dummy website is not having any kind of validations ,please find below the scenarios which can be automated

#1. Login into website with valid/invalid credentials(Login functionality was not working for this website,so couldn't write a scenario for that') 
#2. Verify if user proceeds leaving the mandatory fields blank in the passanger details page
#3.Verify if user provides incorrect credit card number
#4.Verify the max and min lengths of all the fields provided, if it is less than min or exceeds max then it should throw error 
#5.Verify if the credit card number is correct and verified (if using any third party integration tool to verify)
#6.Verify the card expiry month and year is equal to or greater than the current date
#7.Verify the flight details and amount in the confirmation page is correct as specified by user while booking 
#8.Verify the flight options coming after the search Flights should only show flights between departure and destination city


#What I could have implemeted if I got more time  

#1.Data Parametarization for flight details and passanger via json/excel
#2.Properties class and file to capture properties like website etc.
#3.Separate page classes to keep xpaths for elements in each page
#4.Separate classes for Validations and Assertions.
 
		