package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMEapp {
	WebDriver driver;
	@Given("The login page is opened")
	public void the_login_page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers & Drivers\\chromedriver.exe");
		  driver =new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm#";
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	    // Write code here that turns the phrase above into concrete actions
		
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	    
	    //throw new cucumber.api.PendingException();
	}

	@Then("user will find a testmeapp homepage")
	public void user_will_find_a_testmeapp_homepage() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
