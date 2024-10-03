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
		 
			  drivers.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
			 drivers.findElement(By.xpath("//span[text()='Tomorrow']")).click();
			 drivers.findElement(By.xpath("(//span[text()='WHITE BIRD'])[2]")).click();
			 drivers.findElement(By.xpath("//span[text()='06:50 PM']")).click();
			 drivers.findElement(By.xpath("//button[@aria-label=\"Submit\"]")).click();
			 drivers.findElement(By.xpath("//button[@class=\"sc-kLhKbu leNRZS reject-terms\"]")).click();
			 drivers.findElement(By.xpath("//span[@id=\"CL.CLUB|F:11\"]")).click();
			 drivers.findElement(By.xpath("//button[@class=\"sc-geXuza jdgnEx btn-proceeded\"]")).click();
			 drivers.findElement(By.xpath("//div[@class=\"booking-summary\"]"));
			 
			 System.out.println("Your Ticket Total is rs.221.46");
			 drivers.findElement(By.xpath("//button[@class=\"sc-geXuza jdgnEx btn-proceeded\"]")).click();
			 drivers.findElement(By.xpath("(//button[text()='ADD'])[3]")).click();
			 System.out.println("Your Grand Total is rs.831.46");
			 drivers.findElement(By.xpath("(//button[text()='Proceed'])[2]")).click();
			 drivers.close();
	}


	}
