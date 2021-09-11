package stepdefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AutomationS.CucumberProject.Base;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	
	public WebDriver driver;

    @Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
        
    	driver =Base.getDriver();
    	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    	
    	driver.manage().window().maximize();
    }

    @When("^User search for \"([^\"]*)\" Vegetable$")
    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
        
    	//     //tagname[@attribute='value']
    	
    	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	
    	
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
       
    //	Assert.assertTrue( driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
   
    	driver.getPageSource().contains(strArg1);
    }
    
   // ----------------------------------------------------------------------------
    
  

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        
    	 Thread.sleep(2000);
    	driver.findElement(By.cssSelector("a.increment")).click();
    	 Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    	
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
       
    	driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    	
    	  }
    
    @Then("Verify selected {string} item is present in checkout page.")
    public void verify_selected_item_is_present_in_checkout_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        
    	driver.getPageSource().contains(string);
    }
    
  
}
