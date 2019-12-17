package Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	private WebDriver driver;
	
	@BeforeTest
	public void initializeDriver() {
		//initialize the Browser
		System.setProperty("webdriver.chrome.driver", XpathConfiguration.ChromedriverLocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void LoginValidation() {
		// Wait until the elements are visible
		WebDriverWait wait = new WebDriverWait(driver, 5);

		// Fetch the URL
		driver.get(XpathConfiguration.url);
		
		try {
			// Send the user email
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConfiguration.userEmail))).sendKeys(properties("Email"));
			// send the user password
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConfiguration.userPassword))).sendKeys(properties("Password"));
			// login to the Application
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConfiguration.loginButton))).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void Closethedriver() {
		driver.quit();
		System.out.println("Hello world");
	}

	// Method that communicates with external properties file
	public static String properties(String key) throws Exception {
		File fl = new File(XpathConfiguration.userCredentials);
		FileInputStream file = new FileInputStream(fl);
		Properties rpop = new Properties();
		rpop.load(file);
		String data = rpop.getProperty(key);
		return data;

	}
}
