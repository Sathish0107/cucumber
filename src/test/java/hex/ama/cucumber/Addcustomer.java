package hex.ama.cucumber;

import java.util.List;

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

	@Given("launch the browser")
	public void launch_the_browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asus\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/telecom/");
	}

	@When("enter the customer {string} details")
	public void enter_the_customer_details(String string, DataTable dataTable) {

		List<String> onedlist = dataTable.asList();

		driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(onedlist.get(0));
		driver.findElement(By.id("lname")).sendKeys(onedlist.get(1));
		driver.findElement(By.id("email")).sendKeys(onedlist.get(2));
		driver.findElement(By.xpath("(//*[@id='message'])[2]")).sendKeys(onedlist.get(3));
		;
		driver.findElement(By.id("telephoneno")).sendKeys(onedlist.get(4));
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Customer ID']")).isDisplayed()));

	}

}
