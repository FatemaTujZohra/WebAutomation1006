package regression2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper_classes.SetDriver;

public class RegressionClass2 {
     WebDriver driver;
	

	public RegressionClass2(){
		driver = SetDriver.webDriver;
		
	}
	
	
	
	@Test
	public void facebooklogin (){

	
	WebDriver driver= new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver.get("https://www.facebook.com/");
	driver.close();
	}
	
	




}




