package crossbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crbrowserdem {
	 WebDriver driver;
	 @Parameters("browser")
	 @BeforeTest
	 public void Setup(String browser) {
		 if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
		 }
		 
		 if(browser.equalsIgnoreCase("edge")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\edgedriver\\edgedriver.exe");
			 driver= new EdgeDriver();
			 driver.manage().window().maximize();
	 }
	 

}
	 @Test
	 public void login() {
		 driver.get("https://www.facebook.com/login/");
			driver.findElement(By.id("email")).sendKeys("kavitha.sadasivam");
			driver.findElement(By.id("pass")).sendKeys("keasm");
			driver.findElement(By.name("login")).click();
	 }
}