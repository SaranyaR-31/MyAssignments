package Assignmet3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
public static void main(String[] args) {
		
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//To Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		//Locate the Username field
		
		WebElement usernameField=driver.findElement(By.id("username"));
		
		//To enter value of the username field-->
				usernameField.sendKeys("demosalesmanager");
		
		//Locate the password field
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 //Locate Login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Locate the crm/sfa link 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		
		 //Locate the Leadtabs
		 driver.findElement(By.linkText("Accounts")).click();
		 
		 //Locate the CreateAccountLink
		 driver.findElement(By.linkText("Create Account")).click();
		 
		//Locate the Account Name
		 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Saranya R");
    
		 //Locate the sitename
		 driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		 
		 		 
		 //Locate the number of Employess
		 driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("25");
		 
		 //Locate the Description
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 String leadid=driver.findElement(By.id("viewCreate Account_sp")).getText();
		 
		 System.out.println(leadid);
		 String title=driver.getTitle();
		 System.out.println(title);
		 
}}

