package Assignment4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Ajio {
	
		 public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver = new ChromeDriver();
				driver.get("http://www.Ajio.com//");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='input_SearchBox']")).sendKeys("Bags");
				driver.findElement(By.xpath("//span[@class='fnl-header-searchBtn']")).click();
				driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[@class='facet-linkfref '])[8]")).click();
				String items=driver.findElement(By.xpath("//div[@class='length']")).getText();
				 System.out.println(items);
				List<WebElement> Brand = driver.findElements(By.className("brand"));
				System.out.println("Brands");
				for (WebElement Brands:Brand) {
					System.out.println(Brands.getText());
					
					Thread.sleep(2000);
					List<WebElement> bagNames =driver.findElements(By.className("nameCls"));
					System.out.println("Bag Names");
					for (WebElement bagnames:bagNames) {
						System.out.println(bagnames.getText());
					}
				}
					
				}
}
