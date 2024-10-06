package Marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class SalesForceTC1 extends ProjectSpecificMethod {
	@Test	
	public void createOpportunity() throws InterruptedException {
		
	//CLICK OPPORTUNITY
	WebElement ClickOpportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();",ClickOpportunity);
	
	driver.findElement(By.xpath("//div[@title='New']")).click();
	
	Thread.sleep(3000);
	//OPPORTUNITYNAME GIVEN
	driver.findElement(By.xpath("//label[text()='Opportunity Name']"));
	
	WebElement Name=driver.findElement(By.xpath("//input[@name='Name']"));
	Name.sendKeys("SalesforceAutomation by Saranya.R");
	
	driver.findElement(By.xpath("//label[text()='Amount']"));
	
	WebElement Amount= driver.findElement(By.xpath("(//input[@inputmode='decimal'])[4]"));
	Amount.sendKeys("75000");
	
	//select the Date 
	
	driver.findElement(By.xpath("(//input[@class='slds-input'])[6]")).click();
	
	Thread.sleep(3000);
	//select date for tommorrow
	driver.findElement(By.xpath("(//table[@class='slds-datepicker__month'])//tr[1]/td[6]")).click();
	Thread.sleep(2000);
	//select the stage
	
	WebElement scroll = driver.findElement(By.xpath("//span[text()='Additional Information']"));
	
	WebElement stageDrowdown = driver.findElement(By.xpath("//label[text()='Stage']/following::button"));
	Actions ac = new Actions(driver);
	ac.scrollToElement(scroll).perform();
	stageDrowdown.click();
	
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	String msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	System.err.print(msg);
	
      if(msg.contains("Opportunity")) {
		
		System.out.println("Opportunity SalesForce Created");
	  }
      else {
		System.out.println("Opportunity SalesForce not Created");
	}
	
	
	}
}				