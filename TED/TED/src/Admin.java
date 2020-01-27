import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
          WebDriver driver =new ChromeDriver();
          driver.get("http://ypotedqa.qentelli.io:8084/#/login");
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
          driver.manage().deleteAllCookies();
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("ted.admin@qentelli.com");
          driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Ted@123");
          driver.findElement(By.xpath("//button[@type='submit']")).click();
          
          driver.findElement(By.xpath("//ted-project-card[@class='projects-row__info col-sm-3 ng-star-inserted']")).click();
          driver.findElement(By.xpath("//mat-icon[@class='m-2 mat-icon notranslate material-icons mat-icon-no-color']")).click();
          
	}

}
