package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMImplementation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers & Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass project=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		project.clickLink();
		project.typeName("rimarai86@gmail.com");
		project.typePwd("123456");
		project.clickLogin();
		System.out.println("The Page title is "+driver.getTitle());

	}

}
