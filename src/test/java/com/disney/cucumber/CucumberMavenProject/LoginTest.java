package com.disney.cucumber.CucumberMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	String baseURL = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php ";
	String driverpath = "C:\\Users\\d.khera\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	
	@Given("^User launches the application$")
	public void user_launches_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver= new ChromeDriver();
        driver.get(baseURL);  
	}

	@When("^User enters credentials$")
	public void user_enters_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		uname.sendKeys("opensourcecms");
		pass.sendKeys("opensourcecms");
	}

	@When("^Clicks on Sign-in button$")
	public void clicks_on_Sign_in_button(){
	    // Write code here that turns the phrase above into concrete actions
		WebElement signin = driver.findElement(By.xpath(
				"//*[@id=\"wp-submit\"]"));
		signin.click(); 
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login(){
	    // Write code here that turns the phrase above into concrete actions
		//String expectedTitle = "Dashboard ‹ opensourcecms — WordPress";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);;
	}

}
