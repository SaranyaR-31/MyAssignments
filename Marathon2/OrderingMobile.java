package Marathon2;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {



		public static void main(String[] args) throws IOException, InterruptedException {
		//pom inheritance
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);


		// Launch ServiceNow application
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Shadow shadow = new Shadow(driver);
		// Login with valid credentials username as admin and password as India@123
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();


		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();


		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();


		// Select Apple iPhone 13
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		// Update color field to rose gold and storage field to 128GB


		driver.findElement(By.xpath("//label[text()='No']")).click();
		WebElement data = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		data.click();
		Select sc = new Select(data);
		sc.selectByIndex(2); //
		driver.findElement(By.xpath("//option[contains(@value,'Unlimited')]")).click();
		driver.findElement(By.xpath("//label[text()='Blue']")).click();
		driver.findElement(By.xpath("//label[text()='128 GB']")).click();
		// Select Order now option
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		// Verify order is placed and copy the request number" WebElement element2 =
		shadow.findElementByXPath("//div[@class='notification notification-success']");
		// driver.switchTo().frame(element2);
		// String text = element2.getText();
		// System.out.println(text);
		String text2 = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request Number" + text2);


		}
		}







