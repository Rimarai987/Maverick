package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver=null;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("//input[@value='Log in']");
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clickLink() {
		driver.findElement(lnc).click();
	}
	public void typeName(String username) {
		driver.findElement(uname).sendKeys(username);
	}
	public void typePwd(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickLogin() throws InterruptedException {
		driver.findElement(login).click();
		Thread.sleep(5000);
		driver.close();
	}
	
	

}
