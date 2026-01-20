package Day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) {
   WebDriver driver = new ChromeDriver();
   driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
WebElement logo = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
System.out.println("Display status of logo:"+logo.isDisplayed());

WebElement home = driver.findElement(By.xpath("//div[@id='PageList2']//a[normalize-space()='Home']"));
home.click();

	}

}
