import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class GoogleTest {

	
	@Test
	public void homePageCheck() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
//		caps.setPlatform(Platform.WIN11);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"),caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		driver.close(); 
		
		
	}
}
 