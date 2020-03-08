package executionscript;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import automationlibrary.AutomationScript;

public class TCID1 {
	@Test
	public void startTest() {
		AutomationScript.getInstance().launcher();
	}
	

}
