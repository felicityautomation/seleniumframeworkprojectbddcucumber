package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoBlazeLoginPage;
import utilities.BrowserUtil;

public class StepDefinition {
	RemoteWebDriver driver;
	
	@Given("user opened the browser")
	public void user_opened_the_browser() {
	   driver=BrowserUtil.getDriver();
	}

	@When("user navigated to Demo Blaze login page")
	public void user_navigated_to_demo_blaze_login_page() {
	   driver.get("https://www.demoblaze.com/index.html");
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		loginPage.clickOnLoginLink();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
	}

	@When("user enter user name as {string} and password as {string}")
	public void user_enter_user_name_as_and_password_as(String userName, String password) {
		driver.findElement(By.id("loginusername")).sendKeys(userName);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("Demo Blaze home page should be displayed with logout link")
	public void demo_blaze_home_page_should_be_displayed_with_logout_link() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout2")));
		boolean flag=driver.findElement(By.id("logout2")).isDisplayed();
		Assert.assertEquals(flag, true);	
	}
	
	@Then("error popup should be displayed")
	public void error_popup_should_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		String text=driver.switchTo().alert().getText();
		System.out.println("Alert message is:="+text);
		Assert.assertEquals("Wrong password.", "Wrong password.");
		driver.switchTo().alert().accept();
	}


}
