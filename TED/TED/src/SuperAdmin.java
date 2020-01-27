import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperAdmin {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
          WebDriver driver =new ChromeDriver();
          driver.get("http://ypoteddev.qentelli.io:8084/#/login");
        // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
          driver.manage().deleteAllCookies();
          driver.manage().window().maximize();
     
          driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("ted.superadmin@qentelli.com");
          driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Ted@123");
          driver.findElement(By.xpath("//button[@type='submit']")).click();
          driver.findElement(By.xpath("//div[@class='d-flex justify-content-center ']")).click();
          
           driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("Google Analytics");
           driver.findElement(By.xpath("//input[@placeholder='Project Owner']")).sendKeys("Sunil");
           driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys("User");
           driver.findElement(By.xpath("//input[@placeholder='Add Admin(s) to this Project']")).sendKeys("Admin");
           driver.findElement(By.xpath("//button[@class='text-white ml-1 mat-raised-button mat-primary']")).click();
	}
	

	
}

