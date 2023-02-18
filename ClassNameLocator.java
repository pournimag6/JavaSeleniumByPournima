package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58746164597%26hvpone%3D%26hvptwo%3D%26hvadid%3D617721280249%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D16564517919435641607%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301536%26hvtargid%3Dkwd-298741529014%26hydadcr%3D5903_2362026%26gclid%3DCj0KCQiAqOucBhDrARIsAPCQL1Z7lwRCDCs4m0eorrkGc06y-YhOl-43DBN5IfypxDb5UqzNc8vt-fYaAsfUEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		//driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys("pournima@gmail.com");
		driver.findElement(By.id("ap_email")).sendKeys("pournima@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.className("a-button-input")).click();
	}

}
