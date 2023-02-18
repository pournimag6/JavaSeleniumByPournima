package methodsOfWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
	EdgeDriver Driver = new EdgeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com/");
	Thread.sleep(3000);
	Driver.switchTo().activeElement().sendKeys("selenium");

	}

}
