package by.htp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBelavia {
	
		private static final String CHROME = "webdriver.chrome.driver";
		private static final String CHROME_PATH = "src/main/resoursces/chromedriver.exe";
		
		public static void main(String[] args) throws InterruptedException {
//			String emailTo = "sviatlana.zakharenka@gmail.com";
			
			System.setProperty(CHROME, CHROME_PATH);
			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();

			driver.get("https://belavia.by/");
			

//			driver.get("https://google.com");
//			
//			WebElement element=driver.findElement(By.name("q"));
//			element.sendKeys("what is web driver");
//			element.submit();

			//--- login page ---

//			String xpathTxtLogin = "//input[@id='mailbox:login']";
//			By txtLogin = By.xpath(xpathTxtLogin);
//			WebElement element =  driver.findElement(txtLogin);

//			WebElement txtFlightFrom =  driver.findElement(By.xpath("//child::label[attribute::for='OriginLocation_Combobox']"));//input[@id='mailbox:login']
//			txtFlightFrom.clear();
//			txtFlightFrom.sendKeys("Минск");
//
//			WebElement txtFlightTo =  driver.findElement(By.xpath("//child::label[attribute::for='OriginLocation_Combobox']"));//input[@id='mailbox:password']
//			txtFlightTo.clear();
//			txtFlightTo.sendKeys("Рига");
//			
//			Thread.sleep(250); //wait open page writte new email

//			WebElement buttonEnter =  driver.findElement(By.xpath("//child::input[attribute::class='o-control']"));//input[@class='o-control']
//			buttonEnter.click();
//
//			//--- main email page ---
//			Thread.sleep(10000); //wait open page 
//			WebElement buttonWriteEmail =  driver.findElement(By.xpath("//child::div[attribute::id='b-toolbar__left']//child::span")); //div[@id='b-toolbar__left']//span
//			buttonWriteEmail.click();
//			
//			Thread.sleep(250); //wait open page writte new email
//
//			WebElement txtTo =  driver.findElement(By.xpath("//child::textarea[attribute::data-original-name='To']"));
//			txtTo.clear();
//			txtTo.sendKeys(emailTo);
//			
//			WebElement txtSubject =  driver.findElement(By.xpath("//child::input[attribute::name='Subject']"));
//			txtSubject.clear();
//			txtSubject.sendKeys("My email for you!!");
//			
//			WebElement elementIframe = driver.findElement(By.xpath("//child::td/child::iframe"));
//			driver.switchTo().frame(elementIframe);
//			
//			WebElement txtBody =  driver.findElement(By.xpath("//child::body[attribute::id='tinymce']"));
//			txtBody.sendKeys("HTP_TAT9 Bialko Natasha: I have done it!!");
//			
//			//https://www.guru99.com/handling-iframes-selenium.html
//			//driver.switchTo().defaultContent();
//			driver.switchTo().parentFrame();
//			
//			WebElement buttonSent =  driver.findElement(By.xpath("//child::div[attribute::class='b-toolbar']//child::span[attribute::class='b-toolbar__btn__text'][1]"));
//			buttonSent.click();
//			
			Thread.sleep(10000);
			driver.close();
		}
	}
//public class Main {
//	
//	private static final String CHROME="webdriver.chrome.driver";
//	private static final String CHROME_PATH="D:\\students\\Korneeva\\chromedriver.exe";
//			
//			public static void main (String[] args) throws InterruptedException{
//				System.setProperty(CHROME, CHROME_PATH);
//				
//				WebDriver driver=new ChromeDriver();
//				driver.get("https://google.com");
//				
//				WebElement element=driver.findElement(By.name("q"));
//				element.sendKeys("what is web driver");
//				element.submit();
//				
//				List<WebElement> results=driver.findElements(By.className("r"));
//				
//				for (WebElement e1: results){
//					String tagName=e1.getTagName();
////					System.out.println(tagName);
////					String aTag=e1.findElement(By.xpath("a")).getTagName();
////					System.out.println(aTag);
//					WebElement a=e1.findElement(By.xpath("a"));
//					String linkName=a.getText();
//					System.out.println(linkName);
//					}
//				
//				element=driver.findElement(By.name("q"));
//				element.clear();
//				element.sendKeys("Java");
//				
//				Thread.sleep(5000);
//				
//				driver.close();
//			}
