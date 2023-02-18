package methodsOfWebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Manage {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();

	}

}
