import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class FacebookTest {

	@Test
	public void loginCheck() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"),caps);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("teenaraghav3017@gmail.com");
		driver.close();
	}
}
