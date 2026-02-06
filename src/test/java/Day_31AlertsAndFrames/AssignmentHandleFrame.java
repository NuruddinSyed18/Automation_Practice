package Day_31AlertsAndFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandleFrame {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame5 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Nuruddin");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();

		
	}

}
