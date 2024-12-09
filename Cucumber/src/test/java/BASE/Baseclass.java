package BASE;
import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass {


		public WebDriver driver;
		
		@Before
		public void setup() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		
		@After
		public void teardown() {
			driver.quit();
		  
		}
	}

