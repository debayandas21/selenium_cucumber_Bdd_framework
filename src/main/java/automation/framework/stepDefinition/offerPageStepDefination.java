package automation.framework.stepDefinition;

import automation.framework.pageObject.offerPage;
import automation.framework.utility.TestContextSetup;
import io.cucumber.java.en.Then;

public class offerPageStepDefination {
	
	public TestContextSetup testContextSetup;
	public offerPage offerValidatePage;
	public offerPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
		this.offerValidatePage= testContextSetup.PageobjectManager.get_offervalidatePage();
	}
	
	
	
	@Then("User clicks on the top deals page.")
	public void user_clicks_on_the_top_deals_page() throws Exception {
	  offerValidatePage.click_checkOut();
	  testContextSetup.genericUtil.WebDriverWait(2);
	  testContextSetup.genericUtil.SwitchWindow();
	}
	@Then("User checks the displayed product offer details.")
	public void user_checks_the_displayed_product_offer_details() {
		offerValidatePage.capture_tableDetail();
	   
	}


}
