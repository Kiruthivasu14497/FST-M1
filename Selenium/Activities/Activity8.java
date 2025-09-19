package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		Actions a= new Actions(driver);
		
		//Open a new browser to https://training-support.net/webelements/mouse-events
		driver.get("https://training-support.net/webelements/mouse-events");
			
		//Get the title of the page and print it to the console.
		System.out.println("Page title: " + driver.getTitle());
		
		//On the page, perform:
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
        //Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. Print the confirmation text at the end of the sequence.
		a.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(5000).click(cargoToml).build().perform();
		// Print the front side text
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
		
		//Double click on the src button. Then right click on the target button and select open. Print the confirmation text at the end of the sequence.
        a.doubleClick(srcButton).pause(3000).moveToElement(targetButton).pause(5000).contextClick(targetButton).pause(3000).build().perform();
        
        // and then open it
        a.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(5000).build().perform();
        // Print the front side text
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        //close the browser
        driver.quit();

	}

}
