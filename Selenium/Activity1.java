package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Open browser
		WebDriver driver= new FirefoxDriver();
		
		//Open the training support site. (https://training-support.net)
		driver.get("https://training-support.net");

		//Print the title of the page
		System.out.println("Title of the page is: "+ driver.getTitle());

		//Click the about us button
		driver.findElement(By.linkText("About Us")).click();

         //Print the title of the new page
		System.out.println("Title of the New page is: "+ driver.getTitle());
		
		//close the browser
		driver.quit();
	}

}
