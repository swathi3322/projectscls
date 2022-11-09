package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	 
	public static WebDriver browserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		
	}
	    else if (browsername.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}
		return driver;
	}
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
	}
	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		return driver = new FirefoxDriver();
	}
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		return driver = new EdgeDriver();
	}
		
	
		
	public static void	urlLaunch(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitWait(String string) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static void quit() {
		driver.quit();
	}
	public static String currenturl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	public static String getAttribute(WebElement e) {
		String att = e.getAttribute("value");
		return att;
		
	}
	public static void moveToElement (WebElement target){
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a= new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
	s.selectByIndex(index);
	}
		
		
		
	
		
}
	
	
	
	
	
	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	



