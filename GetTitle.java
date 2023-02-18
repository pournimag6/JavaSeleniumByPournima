package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String titleOfthePage = driver.getTitle();
		System.out.println(titleOfthePage);
		driver.close();
	}

}
