package helper_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SetDriver {

	
	 public static WebDriver webDriver;
	    public String browser;
	    
	    @Before
	    public void beforeTest() throws Exception {
	        System.out.println("Before test....");
	        
	        //System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  // For Windows
	        webDriver = new ChromeDriver();
	        //webDriver.manage().window().maximize();
            //webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	        }
	    
	    @After
	   public void afterTest(Scenario scenario) {
	       System.out.println("After test....");
	       webDriver.quit();
	    }
	    
	    }

