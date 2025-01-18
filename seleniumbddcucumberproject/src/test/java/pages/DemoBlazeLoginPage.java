package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoBlazeLoginPage {
	
	RemoteWebDriver driver;
	public DemoBlazeLoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	By loginLink=By.id("login2");
	
	public void clickOnLoginLink() {
		driver.findElement(loginLink).click();
	}

}
