package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of page is: " + driver.getTitle());
		
		//On the page, perform:
			//Find the checkbox on the page.
		WebElement checkbox=driver.findElement(By.id("checkbox"));
		    System.out.println("visibility of checkbox is: " + checkbox.isDisplayed());
			
		    //Click the "Toggle Checkbox" button to remove the checkbox.
		    driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		   
			//Wait for the checkbox to disappear.
		   wait.until(ExpectedConditions.invisibilityOf(checkbox));
		   System.out.println("visibility of checkbox is: " + checkbox.isDisplayed());
			
		   //Toggle the checkbox again.
		   driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
	        
			//Wait for it appear and then select it.
		    wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		    System.out.println("Checkbox is selected: " + checkbox.isSelected());
		    
		    //close the browser
		    driver.quit();

	}

}
