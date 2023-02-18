package methodsOfWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		driver.close();

	}

}
