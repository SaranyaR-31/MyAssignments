package Marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForceEditTC2 extends ProjectSpecificMethod{
	@Test
	public void RunEditOpportunity() throws InterruptedException {
		
		//SELECT OPPORTUNITY
		WebElement ClickOpportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",ClickOpportunity);
		
		//Search for the Opportunity 'Salesforce Automation by name
		WebElement SelectSaleForce = driver.findElement(By.xpath("//a[@title='Salesforce Automation by Saranya.R']"));
		Actions SSF = new Actions(driver);
		SSF.doubleClick(SelectSaleForce).perform();
		Thread.sleep(3000);
		
		//Click on the Dropdown icon and select 'Edit'.
		
		driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']")).click();
		
		//WebElement EditOpportunity = 
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		//select date as 
			driver.findElement(By.xpath("(//input[@class='slds-input'])[7]")).click();
		driver.findElement(By.xpath("(//table[@class='slds-datepicker__month'])//tr[1]/td[7]")).click();
		Thread.sleep(2000);
		
		
		
		WebElement stageDrowdown = driver.findElement(By.xpath("//label[text()='Stage']/following::button"));
		
		//Actions ac = new Actions(driver);
		//ac.scrollToElement(scroll).perform();
		stageDrowdown.click();
		
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.err.println(msg);
		
		if(msg.contains("Opportunity")) {
			
			System.out.println("Opportunity SalesForce Created");
		}else {
			System.out.println("Opportunity SalesForce not Created");
		}
	}

}