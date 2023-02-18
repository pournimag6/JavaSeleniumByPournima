package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillshare.com/en/");
		
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		

	}

}
