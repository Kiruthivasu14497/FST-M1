package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/login-form");
        
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username field and enter the username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        
        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        
        // Find the login button and click it
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Print the confirmation message
        System.out.println(driver.findElement(By.xpath("//h2[contains(text(), 'Admin')]")).getText());
        
        // Close the browser
        driver.quit();

	}

}
