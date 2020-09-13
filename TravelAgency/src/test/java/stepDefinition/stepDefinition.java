package stepDefinition;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.blazeDemoHomePage;

public class stepDefinition {

	blazeDemoHomePage pages = new blazeDemoHomePage();

	@Given("^I navigate to the Blazedemo \"(.*)\"$")
	public void navigatetoBlazeDemoUrl(String url) {
		pages.navigatetoBlazeDemoUrl(url);

	}

	@And("^I enter departure city \"(.*)\"$")
	public void enterDepartureCity(String departureCity) {
		pages.enterDepartureCity(departureCity);

	}

	@And("^I enter destination city \"([^\"]*)\"$")
	public void i_enter_destination_city(String destinationCity) throws Throwable {
		pages.i_enter_destination_city(destinationCity);
	}

	@When("^I click on Find Flights$")
	public void i_click_on_Find_Flights() throws Throwable {
pages.i_click_on_Find_Flights();
	}

	@SuppressWarnings("deprecation")
	@Then("^I navigate to Flight details Page$")
	public void i_navigate_to_Flight_details_Page() throws Throwable {
Assert.assertEquals("Flights from Boston to New York:", pages.i_navigate_to_Flight_details_Page());

	}

	@When("^I choose the flight$")
	public void i_choose_the_flight() throws Throwable {
     pages.i_choose_the_flight();
	}

	@SuppressWarnings("deprecation")
	@Then("^I navigate to the next page to enter passanger details$")
	public void i_navigate_to_the_next_page_to_enter_passanger_details() throws Throwable {
		Assert.assertEquals("Your flight from TLV to SFO has been reserved.", pages.i_navigate_to_the_next_page_to_enter_passanger_details());

	}

	@Then("^I enter below the required details$")
	public void i_enter_below_the_required_details( DataTable passangerDetails) throws Throwable  {
  List<Map<String, String>> list = passangerDetails.asMaps(String.class, String.class);
 String name = list.get(0).get("Name");
 String address = list.get(0).get("Address");
 String city = list.get(0).get("City");
 String state = list.get(0).get("State");
 String zipCode = list.get(0).get("ZipCode");
 String cardType = list.get(0).get("CardType");
 String creditCardNumber = list.get(0).get("CreditCardNumber");
 String cardMonth = list.get(0).get("CardMonth");
 String cardYear = list.get(0).get("CardYear");
 String nameOnCard = list.get(0).get("NameOnCard");

 
 
 pages.i_enter_below_the_required_details(name,address,city,state,zipCode,cardType,creditCardNumber,cardMonth,cardYear,nameOnCard);
	}

	@Then("^I click on Purchase Flight$")
	public void i_click_on_Purchase_Flight() throws Throwable {
pages.i_click_on_Purchase_Flight();
	}

	@SuppressWarnings("deprecation")
	@Then("^I navigate to confirmation page$")
	public void i_navigate_to_confirmation_page() throws Throwable {
		Assert.assertEquals("Thank you for your purchase today!", pages.i_navigate_to_confirmation_page());

	}

	@SuppressWarnings("deprecation")
	@Then("^I veriy the confirmationId$")
	public void i_veriy_the_confirmationId() throws Throwable {
		
		Assert.assertNotNull(pages.i_veriy_the_confirmationId());
	}

}