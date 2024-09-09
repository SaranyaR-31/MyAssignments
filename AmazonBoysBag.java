package Marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBoysBag {
	 public static void main(String[] args) throws InterruptedException  {
		 
		 ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.Amazon.in//");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for Boys");
			driver.findElement(By.xpath("//input[@id=\'nav-search-submit-button\']")).click();
			Thread.sleep(3000);	
			String Print=driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
			System.out.println(Print);
			driver.findElement(By.xpath("//li[@id='p_123/418063']/span")).click();
			driver.findElement(By.xpath("//li[@id='p_123/648962']/span")).click();
			driver.findElement(By.xpath("//span[@tabindex=\"-1\"]")).click();
			driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[text()='Limited time deal'])[7]")).click();
			System.out.println("Brand Skybags="+"String 15Litres Casual Daypack For boys");
			System.out.println("Rs.799"+" "+"Discount 59%"+" "+"Discount price RS.329/-");
			driver.close();
			
			
			
}
}