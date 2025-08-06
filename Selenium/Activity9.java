package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		Actions a= new Actions(driver);
		
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		//Get the title of the page and print it to the console.
		System.out.println("Title of Page: " + driver.getTitle());
		
		//On the page, type out a string from the Selenium script to show on the page
		a.sendKeys("This is coming from Selenium").sendKeys(Keys.RETURN).build().perform();
        
		//Print the message to the console.
		String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pageText);
		
		//Close the browser.
        driver.quit();

	}

}
