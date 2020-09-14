package pages;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cucumber.api.java.en.Then;

public class blazeDemoHomePage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//select[@name='fromPort']")
	public WebElement departureCity;
	@FindBy(how = How.XPATH, using = "//select[@name='toPort']")
	public WebElement destinationCity;
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	public WebElement findFlights;
	@FindBy(how = How.XPATH, using = "//div[@class='container']/h3[text()='Flights from Boston to New York: ']")
	public WebElement navigateFlightDetais;
	@FindBy(how = How.XPATH, using = "//table[@class='table']/tbody/tr[1]/td[1]/input")
	public WebElement chooseFlightButton;
	@FindBy(how = How.XPATH, using = "//div[@class='container']/h2[text()='Your flight from TLV to SFO has been reserved.']")
	public WebElement navigatePassangerDetails;
	@FindBy(how = How.XPATH, using = "//input[@id='inputName']")
	public WebElement passangerName;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	public WebElement passangerAddress;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	public WebElement passangerCity;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	public WebElement passangerState;
	@FindBy(how = How.XPATH, using = "//input[@id='zipCode']")
	public WebElement passangerZipCode;
	@FindBy(how = How.XPATH, using = "//select[@id='cardType']")
	public WebElement passangerCardType;
	@FindBy(how = How.XPATH, using = "//input[@id='creditCardNumber']")
	public WebElement passangerCreditCardNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='creditCardMonth']")
	public WebElement passangerCardMonth;
	@FindBy(how = How.XPATH, using = "//input[@id='creditCardYear']")
	public WebElement passangerCardYear;
	@FindBy(how = How.XPATH, using = "//input[@id='nameOnCard']")
	public WebElement passangerNameOnCard;
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	public WebElement purchaseFlightButton;
	@FindBy(how = How.XPATH, using = "//div[@class='container hero-unit']/h1[text()='Thank you for your purchase today!']")
	public WebElement navigateConfirmationPage;

	@FindBy(how = How.XPATH, using = "//table[@class='table']/tbody/tr[1]/td[2]")
	public WebElement confrimationId;

	@FindBy(how = How.XPATH, using = "//div[@class='optanon-alert-box-button-middle accept-cookie-container']")
	public WebElement cookiesAccept;
	
	public blazeDemoHomePage() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/java/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);

	}
	
	public void navigatetoBlazeDemoUrl(String url) {
		driver.get(url);
	}
	
	public void enterDepartureCity(String departureCityValue) {
		Select select = new Select(departureCity);
		select.selectByVisibleText(departureCityValue);


	}
	
	public void i_enter_destination_city(String destinationCityValue) throws Throwable {
		Select select = new Select(destinationCity);
		select.selectByVisibleText(destinationCityValue);

	}
	
	public void i_click_on_Find_Flights() throws Throwable {
		findFlights.click();
	}

	
	public String i_navigate_to_Flight_details_Page() throws Throwable {
		String navigateFlightDetaisText = navigateFlightDetais.getText();
		return navigateFlightDetaisText;
	}
	
	public void i_choose_the_flight()  {
		chooseFlightButton.click();
	}
	
	public String i_navigate_to_the_next_page_to_enter_passanger_details()  {
		String navigatePassangerDetailsText = navigatePassangerDetails.getText();
		return navigatePassangerDetailsText;
	}
	
	public void i_enter_below_the_required_details(String name ,String address,String city,String state,String zipCode,String cardType,String creditCardNumber,String cardMonth,String cardYear,String nameOnCard) throws Throwable {
		passangerName.sendKeys (name);
		passangerAddress.sendKeys(address);
		passangerCity.sendKeys(city);
		passangerState.sendKeys(state);
		passangerZipCode.sendKeys(zipCode);
		
		Select select = new Select(passangerCardType);
		select.selectByVisibleText(cardType);

		passangerCreditCardNumber.sendKeys(creditCardNumber);
		passangerCardMonth.clear();
		passangerCardMonth.sendKeys(cardMonth);
		passangerCardYear.clear();
		passangerCardYear.sendKeys(cardYear);
		passangerNameOnCard.sendKeys(nameOnCard);
	}
	
	public void i_click_on_Purchase_Flight() {
		purchaseFlightButton.click();
	}
	
	public String i_navigate_to_confirmation_page() {
		String navigateConfirmationPageText= navigateConfirmationPage.getText();
		return navigateConfirmationPageText;
	}



	public String i_veriy_the_confirmationId() {
		String confirmationIdValue = confrimationId.getText();
		return confirmationIdValue;
	}


}