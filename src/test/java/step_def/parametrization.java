package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parametrization {
	WebDriver driver;
	@Given("User will open the application")
	public void user_will_open_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers & Drivers\\chromedriver.exe");
		  driver =new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm#";
		  driver.get(url);
		  driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user will click on sign in link")
	public void user_will_click_on_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters {string} & {string}")
	public void user_enters(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Message displayed login successful")
	public void message_displayed_login_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
