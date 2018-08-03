package by.htp;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vitali_Shulha on 20-Oct-16.
 */
public class DriverSingletone {

	private static WebDriver driver;
	private static final Logger logger = LogManager.getRootLogger();

	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "D:\\students\\Korneeva\\chromedriver.exe";

	private DriverSingletone() {
	};

	public static WebDriver getDriver() {
		if (null == driver) {
			System.setProperty(CHROME, CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			logger.info("Browser started");
		}

		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}
}
