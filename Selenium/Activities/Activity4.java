package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/target-practice");
        
        //Get the title of the page and print it to the console.
        System.out.println("Tile of the page is " + driver.getTitle());
        
        //Using xpath:
        	//Find the 3rd header on the page and print it's text to the console.
            String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
            System.out.println(thirdHeaderText);
            
        	//Find the 5th header on the page and print it's color.
            Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
            System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
            System.out.println("Color as hexcode: " + fifthHeaderColor.asHex()); 
            
        //Using any other locator:
            //Find the purple button and print all it's classes.
            String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
            System.out.println(purpleButtonClass);
            
            //Find the slate button and print it's text.
            String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
            System.out.println(slateButtonText);
            
        //Close the browser
            driver.quit();
	}

}
