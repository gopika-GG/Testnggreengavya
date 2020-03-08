package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CustomWebDriver {
	public static WebDriver driver;
	public static CustomWebDriver getInstance() {
		CustomWebDriver automation=new CustomWebDriver();
		return automation;
	}
	@BeforeSuite
	public void initialize() {
		System.out.println("Test initialize");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sowibo\\Desktop\\Work\\selenium\\dependency\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@AfterSuite
	public void destroy() {
		driver.quit();
	}

}
