package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemasBooking {
	 public static void main(String[] args) throws InterruptedException  {
		 
			ChromeDriver driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.get("http://Pvrcinemas.com//");
			  
			    
			  //Locate cinemas
			  
			  driver.findElement(By.className("cinemas-inactive")).click();
			 
			  driver.findElement(By.xpath("//div[@id='cinema']")).click();
			  
			  driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
			  		 
			//  driver.findElement(By.xpath("//div[@id='date']")).click();
			  Thread.sleep(3000);
		 
			  driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
			  driver.findElement(By.xpath("(//span[text()='SARIPODHA SANIVAARAM'])[2]")).click();
			  driver.findElement(By.xpath("//span[text()='10:45 PM']")).click();
			  driver.findElement(By.xpath("//span[text()='Book']")).click();
			  driver.findElement(By.xpath("//button[text()='Accept']")).click();
			  driver.findElement(By.xpath("//span[@id='CL.CLUB|I:6']")).click();
			  driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			  driver.findElement(By.xpath("(//button[text()='ADD'])[3]")).click();
			  driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			  
					  
}
	
	
	}
