$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BlazeDemo Flight Booking Functionality.feature");
formatter.feature({
  "line": 2,
  "name": "Flight ticket booking functionality",
  "description": "",
  "id": "flight-ticket-booking-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "",
  "description": "Open Blazedemo Website and enter valid details to get the flight details",
  "id": "flight-ticket-booking-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Blazedemo \"\u003cwebsite\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter departure city \"\u003cdepartureCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter destination city \"\u003cdestinationCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Find Flights",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I navigate to Flight details Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I choose the flight",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I navigate to the next page to enter passanger details",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter below the required details",
  "rows": [
    {
      "cells": [
        "Name",
        "Address",
        "City",
        "State",
        "ZipCode",
        "CardType",
        "CreditCardNumber",
        "CardMonth",
        "CardYear",
        "NameOnCard"
      ],
      "line": 15
    },
    {
      "cells": [
        "John Smith",
        "5th Cross Bengaluru",
        "Bengaluru",
        "Karnataka",
        "560017",
        "Visa",
        "400890047878",
        "09",
        "2028",
        "John Smith"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Purchase Flight",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I navigate to confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I veriy the confirmationId",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "flight-ticket-booking-functionality;;",
  "rows": [
    {
      "cells": [
        "website",
        "departureCity",
        "destinationCity"
      ],
      "line": 23,
      "id": "flight-ticket-booking-functionality;;;1"
    },
    {
      "cells": [
        "http://blazedemo.com",
        "Boston",
        "New York"
      ],
      "line": 24,
      "id": "flight-ticket-booking-functionality;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "Open Blazedemo Website and enter valid details to get the flight details",
  "id": "flight-ticket-booking-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Blazedemo \"http://blazedemo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter departure city \"Boston\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter destination city \"New York\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Find Flights",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I navigate to Flight details Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I choose the flight",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I navigate to the next page to enter passanger details",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter below the required details",
  "rows": [
    {
      "cells": [
        "Name",
        "Address",
        "City",
        "State",
        "ZipCode",
        "CardType",
        "CreditCardNumber",
        "CardMonth",
        "CardYear",
        "NameOnCard"
      ],
      "line": 15
    },
    {
      "cells": [
        "John Smith",
        "5th Cross Bengaluru",
        "Bengaluru",
        "Karnataka",
        "560017",
        "Visa",
        "400890047878",
        "09",
        "2028",
        "John Smith"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Purchase Flight",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I navigate to confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I veriy the confirmationId",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://blazedemo.com",
      "offset": 29
    }
  ],
  "location": "stepDefinition.navigatetoBlazeDemoUrl(String)"
});
formatter.result({
  "duration": 12443217900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Boston",
      "offset": 24
    }
  ],
  "location": "stepDefinition.enterDepartureCity(String)"
});
formatter.result({
  "duration": 149275100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 26
    }
  ],
  "location": "stepDefinition.i_enter_destination_city(String)"
});
formatter.result({
  "duration": 100048100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_Find_Flights()"
});
formatter.result({
  "duration": 602664400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_navigate_to_Flight_details_Page()"
});
formatter.result({
  "duration": 34479900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_choose_the_flight()"
});
formatter.result({
  "duration": 455763800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_navigate_to_the_next_page_to_enter_passanger_details()"
});
formatter.result({
  "duration": 34336200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_enter_below_the_required_details(DataTable)"
});
formatter.result({
  "duration": 757706300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_Purchase_Flight()"
});
formatter.result({
  "duration": 520945700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_navigate_to_confirmation_page()"
});
formatter.result({
  "duration": 32077000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_veriy_the_confirmationId()"
});
formatter.result({
  "duration": 31062400,
  "status": "passed"
});
});