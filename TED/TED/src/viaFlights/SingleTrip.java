package viaFlights;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleTrip {

	

	public static void test(WebDriver driver, WebDriverDto dto) {
		  driver.get("https://in.via.com/flight-tickets/airindia-flights?utm_source=google&utm_medium=cpc&utm_campaign=domestic-airlines-bmm-airindia&gclid=EAIaIQobChMI54XQppGj5wIVQRx9Ch0NugeGEAAYBCAAEgIPBfD_BwE");
          driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
          driver.manage().deleteAllCookies();
          driver.manage().window().maximize();
          driver.findElement(By.xpath(dto.getSourceXpath())).sendKeys(dto.getSourcesendKey());
          driver.findElement(By.xpath(dto.getSourceclickXPath())).click();
          driver.findElement(By.xpath(dto.getDestinationXpath())).sendKeys(dto.getDestinationsendKey());
          driver.findElement(By.xpath(dto.getDesstinationlickXPath())).click();
          
          driver.findElement(By.xpath(dto.getDatePickerXpath())).click();
          driver.findElement(By.xpath(dto.getGender())).click();
          driver.findElement(By.xpath(dto.getSearch())).click();
          driver.findElement(By.xpath(dto.getBookFlight())).click();
	}

}