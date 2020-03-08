package automationlibrary;

import java.lang.module.FindException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testbase.CustomWebDriver;

public class AutomationScript extends CustomWebDriver{
	WebElement search,button;
	public static AutomationScript getInstance(){
		AutomationScript obj=new AutomationScript();
		return obj;
		
		
		
	}
	public void launcher() {
		driver.get("https://www.greengavya.com");
	}
	public void getElements() {
		search=driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[1]/div/div/div[2]/div[1]/input"));
		button=driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div/button/i"));
		
	}
	public void search() {
		search.sendKeys("apple");
		button.click();
	}

}
