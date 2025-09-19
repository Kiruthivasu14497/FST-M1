package project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass

	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test

	public void verifyWebsiteTitle() {
		String websiteTitle = driver.getTitle();
		Assert.assertEquals(websiteTitle, "Alchemy Jobs – Job Board Application");
	}

	@AfterClass

	public void closeBrowser() {
		driver.quit();

	}

}
