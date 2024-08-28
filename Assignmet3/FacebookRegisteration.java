package Assignmet3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegisteration {
	 public static void main(String[] args) {
		 
			ChromeDriver driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  //add the wait
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  			  
			  driver.get("http://facebook.com//");
			  
			  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			  
			   //Locate the first name
			  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Saranya");

		  	  //Locate the sur name
		      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ravi");
		  
			  //Locate the email
	       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Testleaf2024@gmail.com");
	          //  Password
	        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Testleaf20");
	        // Locate the Day in Birthdate
	        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("31");
	        //Locate the BirthMonth
	       WebElement Month= driver.findElement(By.xpath("//select[@id='month']"));
	             Select month12= new Select(Month);
	      
	             month12.selectByValue("12");
	       
	         // Locate the BirthYear
	        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2000");
	        
	       //Locate the Gender
	       driver.findElement(By.xpath("//label[@for='sex']")).click();
	        
	  
	        //SignUp Click
	        driver.findElement(By.xpath("//button[@name='websubmit")).click();
	  
}
	 
	}
