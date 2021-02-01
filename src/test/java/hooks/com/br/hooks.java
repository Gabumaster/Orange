package hooks.com.br;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {
	
	private static WebDriver driver;

	@Before
	public void inicio() {
		System.out.println("***Oia essa porra funfando***");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void fim() {
		System.out.println("***e funfou mesmo***");
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
