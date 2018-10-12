package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import helper_classes.SetDriver;

public class ToolsQA {
WebDriver driver;
	

	public ToolsQA(){
		driver = SetDriver.webDriver;
		
	}
	@Given("^Navigate to ToolsQA$")
	public void navigate_to_ToolsQA() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.get("http://toolsqa.com/");
	}

	@Given("^go to ToolsQA$")
	public void go_to_ToolsQA() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	


}
