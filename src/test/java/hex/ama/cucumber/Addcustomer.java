package hex.ama.cucumber;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneAnnotation;

public class Addcustomer {

	WebDriver driver;

	/*
	 * @Given("launch the browser") public void launch_the_browser() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Asus\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * driver.get("http://demo.guru99.com/telecom/");
	 * driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
	 * driver.findElement(By.xpath("//*[text()='Done']")).click(); }
	 * 
	 * 
	 * @When("enter the customer details") public void
	 * enter_the_customer_details(io.cucumber.datatable.DataTable dataTable) {
	 * 
	 * Map<String, String> datas= dataTable.asMap(String.class, String.class);
	 * 
	 * driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
	 * driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
	 * driver.findElement(By.id("email")).sendKeys(datas.get("email"));
	 * driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(datas.get(
	 * "address"));
	 * driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phone"));
	 * driver.findElement(By.xpath("//*[@type='submit']")).click(); throw new
	 * cucumber.api.PendingException();
	 * 
	 * }
	 * 
	 * 
	 * @Then("I validate the outcomes") public void i_validate_the_outcomes() {
	 * Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Customer ID']")).
	 * isDisplayed()));
	 * 
	 * }
	 */

	@Given("launch the brwoser")
	public void launch_the_brwoser() {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
				  driver = new ChromeDriver();
				  driver.get("http://demo.guru99.com/telecom/");
				driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
				 driver.findElement(By.xpath("//*[text()='Done']")).click(); 
		
	}

	@When("enter the customer details {string}, {string},{string},{string},{string}")
	public void enter_the_customer_details(String A, String B, String C, String D, String E) {
	  
		driver.findElement(By.id("fname")).sendKeys(A);
		 driver.findElement(By.id("lname")).sendKeys(B);
		 driver.findElement(By.id("email")).sendKeys(C);
		 driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(D);
		 driver.findElement(By.id("telephoneno")).sendKeys(E);
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}

	@Then("Validate outcome")
	public void validate_outcome() {
		
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Customer ID']")).isDisplayed()));
	   
	}

	
	
}
