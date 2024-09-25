package Marathon2;

	import java.time.Duration;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;

	public class TataCliq {

		public static void main(String[] args) throws InterruptedException {
			
			//EdgeOptions opt = new EdgeOptions();
		//	opt.addArguments("--disable-notifications");
			//launch URL
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.tatacliq.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Alert acceptance
			driver.findElement(By.xpath("//button[text()='Yes, I’m In']")).click();
			
			//select Brand
			driver.findElement(By.xpath("//div[text()='Brands']")).click();
		Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='DesktopHeader_categoryAndBrandWithArrow DesktopHeader_categoryAndBrand']"));
			driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[text()='Casio']")).click();
			driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
			driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
			
			Thread.sleep(5000);
			
			List<WebElement> Price = driver.findElements(By.className("ProductDescription__priceHolder"));
			System.out.println("price of watches");
			
			for (WebElement Price1 : Price) {
				System.out.println(Price1.getText());
				
				//click on the first resulting watch
			
				Set<String>windowHandles = driver.getWindowHandles();
				System.out.println(driver.getTitle());
				
				for (String FirstResult : windowHandles) {
					System.out.println(FirstResult);
				}
				//first resulting watch
				WebElement clk = driver.findElement(By.xpath("(//div[@class='ProductDescription__content']/h2)[1]"));
				driver.executeScript("arguments[0].click();", clk);
				Thread.sleep(5000);
				
				//WebElement NewWindow 
				driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		}

	}
	}


