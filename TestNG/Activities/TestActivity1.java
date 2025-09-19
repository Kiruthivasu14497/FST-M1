package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	

	//Declaring the driver object
	WebDriver driver;
	
	//Declaring the wait object
	WebDriverWait wait;
	
	//Setup function
	
	@BeforeClass
	public void setUp() {
		//Initialize the driver
		driver= new FirefoxDriver();
		
		//Initialize the wait
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		//Open the page
		driver.get("https://training-support.net");
	}
	
	@Test(priority = 1)
	public void homePageTest() {
		//Check the pagetitle
		String actual = driver.getTitle();
		System.out.println(actual);
        Assert.assertEquals(actual,"Training Support");
	}
	
	@Test(priority = 2)
	public void aboutUsPageTest() {
		WebElement aboutUs= driver.findElement(By.linkText("About Us"));
		aboutUs.click();
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle,"About Training Support");
	}
	
	@AfterClass
	public void tearDown() {
		//close the browser
		driver.quit();
	}
	

}
