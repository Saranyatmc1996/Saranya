package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;
public static WebDriver launchBrow() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHAKAR\\eclipse-workspace\\BasePom\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	return driver;
}
public static void getUrl(String url) {
	driver.get(url);

}

public static void sendKey(WebElement e, String s) {
	e.sendKeys(s);

}
public static void btnclick(WebElement e) {
	e.click();

}
public static void SelectIndex(WebElement e, int n) {
	new Select(e).selectByIndex(n);
}

public static void selectbyValue(WebElement e,String name) {
	
	new Select(e).selectByValue(name);
	

}




}
