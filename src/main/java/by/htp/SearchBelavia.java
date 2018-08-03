package by.htp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import by.htp.DriverSingletone;

public class SearchBelavia{

	// private static final String CHROME = "webdriver.chrome.driver";
	// private static final String CHROME_PATH =
	// "src/main/resoursces/chromedriver.exe";
	// private static final String CHROME_PATH = "c:/Program
	// Files/eclipse-workspace/Lesson30_SearchBelavia/src/main/resources/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverSingletone.getDriver();

		// System.setProperty(CHROME, CHROME_PATH);
		// WebDriver driver = new ChromeDriver();
		// driver.manage();

		driver.get("https://belavia.by");

		WebElement txtFlightFrom = driver
				.findElement(By.xpath("//child::label[attribute::for='OriginLocation_Combobox']"));// input[@id='mailbox:login']
		txtFlightFrom.sendKeys("Минск");
		// потом выпадающая менюшка
		txtFlightFrom.submit();

		WebElement txtFlightTo = driver
				.findElement(By.xpath("//child::label[attribute::for='OriginLocation_Combobox']"));// input[@id='mailbox:password']
		txtFlightTo.sendKeys("Рига");
		txtFlightTo.submit();

		WebElement butOnewayTicket = driver.findElement(By.xpath("//child::label[attribute::for='JourneySpan_Ow']"));// input[@id='mailbox:password']
		butOnewayTicket.click();

		WebElement selectDate = driver.findElement(By.className("ui-state-default ui-state-highlight ui-state-active"));
		selectDate.sendKeys("01.08.18");
		selectDate.submit();
		Thread.sleep(10000);

		List<WebElement> resultsForFlight = driver.findElements(By.className("r"));

		for (WebElement e1 : resultsForFlight) {
			String flight = e1.getText();
			System.out.println(flight);
		}

		driver.close();
	}
}