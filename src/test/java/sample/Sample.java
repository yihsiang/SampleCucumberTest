package sample; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When; 

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;

public class Sample { 
   WebDriver driver = new ChromeDriver(); 
   
   @Given("^I am on Google search page$") 
   public void goToFacebook() { 
      
		String exePath = "chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver.get("http://www.google.com/");
	
   }
	
   @When("^I enter a search term \"(.*)\"$") 
   public void enterSearchTerm(String arg1) {   
	   driver.findElement(By.id("lst-ib")).sendKeys(arg1); 
	   driver.findElement(By.name("btnK")).submit();

   }
   
   @When("^I click on the Cucumber link$")
   public void clickFirstLink() {
	   WebElement link = driver.findElement(By.linkText("Cucumber"));
	   link.click();
   }
	
   @Then("^I should go to the \"(.*)\" page$")
   public void gotResultPage(String page) {
	   
	   String title = driver.getTitle();	
	   
	   assertThat(title, CoreMatchers.containsString(page));
   }
	
   @Then("^I should get a link to \"(.*)\"$") 
   public void checkFail(String linkName) {  
	   driver.findElement(By.linkText(linkName));

   }
   
   @Then("^the URL is \"(.*)\"$")
   public void isURL(String url) {
	   driver.getCurrentUrl().equals(url);
   }
	
   @After
   public void closeDriver() {
	   driver.close();
   }
   
} 