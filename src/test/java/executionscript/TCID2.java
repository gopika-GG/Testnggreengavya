package executionscript;

import org.testng.annotations.Test;

import automationlibrary.AutomationScript;

public class TCID2 {
	@Test
	public void runTest() {
		AutomationScript.getInstance().getElements();
		AutomationScript.getInstance().search();
	}

}
