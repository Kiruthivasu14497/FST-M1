package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Page title: " + driver.getTitle());
		
		WebElement Fullname= driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"));
		Fullname.sendKeys("Kiruthika");
		
		WebElement EmailAddress= driver.findElement(By.xpath("//input[contains(@id,'-email')]"));
		EmailAddress.sendKeys("kiruthika@gmail.com");
		
		WebElement EventDate = driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
		EventDate.sendKeys("2025-08-12");
        
		WebElement Details = driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]"));
		Details.sendKeys("Selenium Session");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		System.out.println("Success message: " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText());
		
		
		

	}

}
