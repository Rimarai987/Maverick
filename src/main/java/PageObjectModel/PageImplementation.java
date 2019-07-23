package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers & Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		PageClass_PageFactory locateElements=PageFactory.initElements(driver,PageClass_PageFactory.class );
		locateElements.loginMethod("rimarai86@gmail.com", "123456");
	}

}
