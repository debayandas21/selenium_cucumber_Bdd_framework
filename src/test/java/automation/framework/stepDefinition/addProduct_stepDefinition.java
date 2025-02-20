package automation.framework.stepDefinition;

import org.testng.Assert;

import automation.framework.pageObject.productSelectionPage;
import automation.framework.utility.TestContextSetup;
import automation.framework.utility.genericUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addProduct_stepDefinition {
	
	public TestContextSetup testContextSetup;
	public productSelectionPage selectProductPage;

	
	public addProduct_stepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
		this.selectProductPage= testContextSetup.PageobjectManager.get_productSelectionPage();
	}
	
	@Given("User is already in Green Kart home page.")
	public void user_is_already_in_green_kart_home_page() {
	    selectProductPage.verify_pageTitle();
	}
	@Given("User enter a product name {string} in the search bar.")
	public void user_enter_a_product_name_cucumber_in_the_search_bar(String ProudctName) {
	    selectProductPage.enter_productName(ProudctName);
	    testContextSetup.genericUtil.WebDriverWait(2);
		
	}
	@When("Product is displayed with the user entered proudct name.")
	public void product_is_displayed_with_the_user_entered_proudct_name() {
		String ActualProductName= selectProductPage.get_productName();
		Assert.assertEquals(ActualProductName, "Cucumber", "Product name matched with expected");
	}
	@Then("User add the product for {int} times.")
	public void user_add_the_product_for_times(int Count) {
	   selectProductPage.increaseCount(Count);
	   testContextSetup.genericUtil.WebDriverWait(2);
	}
	@Then("User clicks on Add to cart.")
	public void user_clicks_on_add_to_cart() {
		selectProductPage.addToCart_click();
	}
}
