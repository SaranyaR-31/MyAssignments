package Assignmet3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreateForm {
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
						 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Saranya Ravi");
						 
						 //Locate the Description
						 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
						 
						 WebElement industryWE=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
						 Select industryDD=new Select(industryWE);
						 
						 industryDD.selectByVisibleText("Computer Software");
						 
						//Locate the marketing campaignId
						 WebElement campaignWE = driver.findElement(By.id("marketingCampaignId"));
						 
						Select campaignDD=new Select(campaignWE);
						 campaignDD.selectByIndex(6);				 

						 //Locate Ownership
						 WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
						 
						Select ownershipDD=new Select(ownershipWE);
				    	 ownershipDD.selectByVisibleText("S-Corporation");	
						
				    	 //Locate the Source
						 WebElement sourceWE=driver.findElement(By.id("dataSourceId"));
						 Select sourceDD=new Select(sourceWE);
						 sourceDD.selectByValue("LEAD_EMPLOYEE");
							
						 //Locate the State/Province
						 WebElement stateWE=driver.findElement(By.id("generalStateProvinceGeoId"));
							Select stateDD=new Select(stateWE);
							stateDD.selectByValue("TX");
							driver.findElement(By.className("smallSubmit")).click();
							 
							 String leadid=driver.findElement(By.id("viewCreateAccount_sp")).getText();
							 
							 System.out.println(leadid);
							 String title=driver.getTitle();
							 System.out.println(title);

}

}