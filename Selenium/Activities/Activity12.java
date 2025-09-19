package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		
		driver.get("https://training-support.net/webelements/dynamic-content");
		
		System.out.println("Page title is: " + driver.getTitle());
		
		//On the page, perform:
			//Find and click the "Click me!" button.
		    driver.findElement(By.id("genButton")).click();
			
		    //Wait till the word "release" appears.
		    //Get the text and print it to console.
		    
		   if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release"))) {
			   System.out.println(driver.findElement(By.id("word")).getText());
			    }
		   
		//close the browser
		   driver.quit();
		    
		    
			

	}

}
