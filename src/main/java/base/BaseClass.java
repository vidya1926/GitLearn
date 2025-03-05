package base;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass extends DriverFactory {

	@Before
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}

	
	@After
	public void postCondition() {
		driver.quit();
	}

}
