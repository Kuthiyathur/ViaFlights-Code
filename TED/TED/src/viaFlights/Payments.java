package viaFlights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 WebDriverDto dto = new WebDriverDto();
		 //Source
		 dto.setSourceXpath("//input[@name='source']");
		 dto.setSourcesendKey("HYD");
		 dto.setSourceclickXPath("//span[text()='[HYD]']");
		 //Destination
		 dto.setDestinationXpath("//input[@name='destination']");
		 dto.setDestinationsendKey("BLR");
		 dto.setDesstinationlickXPath("//span[text()='[BLR]']");
		 //DatePicker
		 dto.setDatePickerXpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[6]/div[6]");
		 //Gender
		 dto.setGender("//option[@value='1']");
		 //Search
		 dto.setSearch("//div[@id='search-flight-btn']");
		 //BookFlight
		 dto.setBookFlight("//button[@class='bookCTA u_marB5']");
		 //Traveller Details 
		 dto.setTravellerDetails("//select[@id='adult1Title']/option[@value='Mr']");
		 dto.setTravellerFirstname("//input[@placeholder='First Name']");
		 dto.setTravellerSendkeyFname("Kanishka");
		 dto.setTravellerLastname("//input[@placeholder='Last Name']");
		 dto.setTravelerSendkeyLname("Kuthiyathur");
		 SingleTrip.test(driver, dto);
		
	}

}
