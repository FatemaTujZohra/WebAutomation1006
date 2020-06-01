package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_classes.SetDriver;

public class GoogleFooterLinksTest {

	WebDriver driver;
	

	public GoogleFooterLinksTest(){
		driver = SetDriver.webDriver;
		
	}
	
	

	@Given("^I launch the Google home page url$")
	public void i_launch_the_Google_home_page_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.get("https://www.google.com");  
	}

	@Given("^I scroll down to the end of the page$")
	public void i_scroll_down_to_the_end_of_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I select \"([^\"]*)\" link in the Google footer$")
	public void i_select_link_in_the_Google_footer(String footerLink_text) throws Throwable {
		//By linkedElement= By.xpath("//a[contains(text(), '"+ footerLink_text + "')]");
		driver.findElement(By.linkText(footerLink_text)).click();
		//driver.findElement(linkedElement).click();
		Thread.sleep(2000);

	}

	@Then("^I verified the selected Google page by the existence of the \"([^\"]*)\" text$")
	public void i_verified_the_selected_Google_page_by_the_existence_of_the_text(String linkedPage_text) throws Throwable {

		Assert.assertEquals(true, driver.getPageSource().contains(linkedPage_text));
		Thread.sleep(2000);
	}

	@Given("^I select the Privacy link in the Google footer$")
	public void i_select_the_Privacy_link_in_the_Google_footer() throws Throwable {
		driver.findElement(By.linkText("Privacy")).click();
		//*[@id="maia-nav-y"]/ul/li[1]/ul/li[2]/a
		//*[@id="maia-nav-y"]/ul/li[1]/ul/li[1]/a
		Thread.sleep(2000);

	}

	@When("^I click on a specific Privacy Policy  \"([^\"]*)\"$")
	public void i_click_on_a_specific_Privacy_Policy(String privacy_policy) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//By linkedElement= By.xpath("//a[contains(text(), '"+ privacy_policy + "')]");
		By linkedElement= By.linkText(privacy_policy);
		driver.findElement(linkedElement).click();
		//driver.findElement(By.cssSelector("a[data-g-label= 'privacy_policy']")).click();


		Thread.sleep(10000);
	}
	@Then("^I verified the selected \"(.*?)\" Policy detail$")
	public void i_verified_the_selected_Policy_detail(String policy_detail) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    Assert.assertEquals(true, driver.getPageSource().contains(policy_detail));
		Thread.sleep(2000);
	}


	

	@Given("^I select the Terms link in the Google footer$")
	public void i_select_the_Terms_link_in_the_Google_footer() throws Throwable {
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(2000);

	}

	

	@When("^I click on a specific Terms of Service \"(.*?)\"$")
	public void i_click_on_a_specific_Terms_of_Service(String terms_service) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    driver.findElement(By.linkText(terms_service)).click();
		Thread.sleep(15000);
	}

	@Then("^I verified the selected \"(.*?)\" Terms detail$")
	public void i_verified_the_selected_Terms_detail(String terms_detail) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    Assert.assertEquals(true, driver.getPageSource().contains(terms_detail));
		Thread.sleep(2000);
	}

	

	

}
