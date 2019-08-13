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


	 @Given("launch the browser") public void launch_the_browser() {
	 
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\Asus\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.get("http://demo.guru99.com/telecom/");
	  driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
	  driver.findElement(By.xpath("//*[text()='Done']")).click(); }
	  
	  
	  @When("enter the customer detailss")
	  
	  public void enter_the_customer_detailss(io.cucumber.datatable.DataTable dataTable) {
	  
	  Map<String, String> datas= dataTable.asMap(String.class, String.class);
	  
	  driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
	  driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
	  driver.findElement(By.id("email")).sendKeys(datas.get("email"));
	  driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(datas.get(
	  "address"));
	  driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phone"));
	  driver.findElement(By.xpath("//*[@type='submit']")).click(); 
	  throw new cucumber.api.PendingException();
	  
	  }
	 
	@When("enter the customer detailsss {string}, {string},{string},{string},{string}")
	public void enter_the_customer_detailsss(String A, String B, String C, String D, String E) {
	  
		driver.findElement(By.id("fname")).sendKeys(A);
		 driver.findElement(By.id("lname")).sendKeys(B);
		 driver.findElement(By.id("email")).sendKeys(C);
		 driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(D);
		 driver.findElement(By.id("telephoneno")).sendKeys(E);
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
	
	@When("enter the customer detail")
	public void enter_the_customer_detail(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> asLists = dataTable.asLists(String.class);
		
		driver.findElement(By.id("fname")).sendKeys(asLists.get(0).get(0));
		 driver.findElement(By.id("lname")).sendKeys(asLists.get(1).get(1));
		 driver.findElement(By.id("email")).sendKeys(asLists.get(2).get(2));
		 driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(asLists.get(3).get(0));
		 driver.findElement(By.id("telephoneno")).sendKeys(asLists.get(4).get(0));
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
	@When("enter the customer detai")
	public void enter_the_customer_detai(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("fname")).sendKeys(asMaps.get(0).get("fname"));
		 driver.findElement(By.id("lname")).sendKeys(asMaps.get(1).get("lname"));
		 driver.findElement(By.id("email")).sendKeys(asMaps.get(2).get("email"));
		 driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(asMaps.get(3).get("address"));
		 driver.findElement(By.id("telephoneno")).sendKeys(asMaps.get(4).get("phone"));
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
	   
	}


	
	
	
	

	@Then("Validate outcome")
	public void validate_outcome() {
		
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Customer ID']")).isDisplayed()));
	   
	}

	
	
}
