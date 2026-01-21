package Day_28Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}
	
}
