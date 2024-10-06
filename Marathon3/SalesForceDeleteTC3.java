package Marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForceDeleteTC3 extends ProjectSpecificMethod{
	@Test
	public void RunDelete() throws InterruptedException {
		
		//SELECT OPPORTUNITY
				WebElement ClickOpportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
				driver.executeScript("arguments[0].click();",ClickOpportunity);
								
				//Search for the Opportunity 'Salesforce Automation by name
	                      driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Saranya", Keys.ENTER);
                               Thread.sleep(500);
                               WebElement SelectSalesforce = driver.findElement(By.xpath("//a[@data-refid='recordId']"));
     		               SelectSalesforce.click();

				
				//Click on the Dropdown icon and select 'Edit'
				
				driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']")).click();
				
				//WebElement EditOpportunity = 
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				
				driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
				System.out.println("Salesforce Opportunity as deleted");
		
	}

}
