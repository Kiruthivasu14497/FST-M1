package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass

	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test

	public void verifyWebsiteHeading() {
		String websiteHeading = driver.findElement(By.xpath("//*[contains(text(),'Welcome to')]")).getText();
		System.out.println(websiteHeading);
		Assert.assertEquals(websiteHeading, "Welcome to Alchemy Jobs");
	}

	@AfterClass

	public void closeBrowser() {
		driver.quit();

	}

}
