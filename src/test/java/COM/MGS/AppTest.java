package COM.MGS;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void run() {
		System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/");

		driver.quit();
	}
}