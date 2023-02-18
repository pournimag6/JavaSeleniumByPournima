package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("pournima");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
